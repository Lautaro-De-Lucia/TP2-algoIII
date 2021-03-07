package vista;

import controller.Controlador;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import modelo.Observador;
import modelo.sector_bloques.Bloque;


import java.util.ArrayList;

public class AreaBloques extends Group implements Observador {
    private Pane capa;
    private int altoCapa;
    private int anchoCapa;
    private int anchoBloque = 150;
    private int altoBloque = 50;
    private int margen = 12;
    private int altoScroll;
    private int anchoScroll;
    private Controlador controlador;
    ScrollPane scrollPane;

    public AreaBloques(int ancho, int alto, Controlador nuevoControlador){
        capa = nuevaCapa(ancho,alto);
        this.altoCapa = alto;
        this.anchoCapa = ancho;
        this.anchoScroll = ancho;
        this.altoScroll = alto;
        this.scrollPane = nuevoScroll(anchoScroll,altoScroll);
        scrollPane.setContent(capa);
        this.getChildren().add(scrollPane);
        this.controlador = nuevoControlador;
    }

    public ScrollPane nuevoScroll(int ancho, int alto){
        ScrollPane nuevoScroll = new ScrollPane();
        nuevoScroll.setFitToWidth(true);
        nuevoScroll.setPrefSize(ancho, alto);
        nuevoScroll.setVvalue(1.0d);
        return nuevoScroll;
    }


    public Pane nuevaCapa(int ancho,int alto){
        Pane nuevaCapa = new Pane();
        nuevaCapa.setStyle("-fx-background-color: lightblue;");
        nuevaCapa.setPrefSize(ancho,alto);
        return nuevaCapa;
    }


    public void recBloques(ArrayList<Bloque> listaBloques,float escala){
        for (int i=0; i<listaBloques.size(); i++){
            agregarBloque(listaBloques.get(i).getNombre(),escala);
            recBloques(listaBloques.get(i).getSecuencia(), (float) (escala - 0.1));
        }
    }



    public void agregarBloque(String nombre, float escala){
        ImageView bloque = new ImageView(new Image("bloque.png",anchoBloque*escala,altoBloque*escala,false,false));
        Text text = new Text(nombre);
        text.setStyle("-fx-font: 18 arial");
        StackPane stack = new StackPane();
        stack.getChildren().addAll(bloque, text);
        stack.setLayoutX((this.anchoCapa - this.anchoBloque*escala)/2);
        try {
            int anteriorY = (int) (this.capa.getChildren().get(this.capa.getChildren().size() - 1)).getLayoutY();
            Arrow nuevaFlecha = new Arrow((this.anchoCapa)/2,anteriorY + this.altoBloque,(this.anchoCapa)/2,anteriorY+(this.anchoBloque/2));
            this.capa.getChildren().add(nuevaFlecha);
            stack.setLayoutY(anteriorY + anchoBloque/2);
        }
        catch (Exception e){
            stack.setLayoutY(margen);
        }
        if (stack.getLayoutY()+this.altoBloque > altoCapa){
            this.capa.setPrefHeight(stack.getLayoutY()+ this.altoBloque);
            this.altoCapa = (int) (stack.getLayoutY() + this.altoBloque);
        }
        this.capa.getChildren().add(stack);
    }

    @Override
    public void refrescar() {
        this.capa = nuevaCapa(this.anchoScroll,this.altoScroll);
        this.getChildren().remove(this.scrollPane);
        this.scrollPane = nuevoScroll(anchoScroll,altoScroll);
        this.scrollPane.setContent(this.capa);
        this.getChildren().add(this.scrollPane);
        ArrayList<Bloque> bloquesActuales = this.controlador.obtenerSecuencia();
        recBloques(bloquesActuales,1);
    }
}