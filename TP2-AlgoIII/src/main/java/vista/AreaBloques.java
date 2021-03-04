package vista;

import controller.Controlador;
import javafx.scene.Group;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import modelo.Observador;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Invocador;

import java.util.ArrayList;

public class AreaBloques extends Group implements Observador {
    private Pane capa;
    private int altoCapa;
    private int anchoCapa;
    private int anchoBloque = 120;
    private int altoBloque = 40;
    private int margen = 12;
    private Controlador controlador;
    ScrollPane scrollPane;

    public AreaBloques(int ancho, int alto, Controlador nuevoControlador){
        capa = nuevaCapa(ancho,alto);
        this.altoCapa = alto;
        this.anchoCapa = ancho;
        this.scrollPane = new ScrollPane();
        scrollPane.setContent(capa);
        scrollPane.setFitToWidth(true);
        //scrollPane.setFitToHeight(true);
        scrollPane.setPrefSize(300, 700);
        AnchorPane.setTopAnchor(scrollPane, 0.);
        AnchorPane.setRightAnchor(scrollPane, 0.);
        AnchorPane.setBottomAnchor(scrollPane, 0.);
        AnchorPane.setLeftAnchor(scrollPane, 0.);
        this.getChildren().add(scrollPane);
        //this.getChildren().add(this.capa);
        this.controlador = nuevoControlador;
    }


    public Pane nuevaCapa(int ancho,int alto){
        Pane nuevacapa = new Pane();
        //nuevacapa = new Pane();
        nuevacapa.setStyle("-fx-background-color: lightblue;");
        nuevacapa.setPrefSize(ancho,alto);
        return nuevacapa;
    }


    public void agregarBloque(String nombre){
        Rectangle nuevo = new Rectangle();
        nuevo.setHeight(altoBloque);
        nuevo.setWidth(anchoBloque);
        nuevo.setFill(Color.GREENYELLOW);
        Text text = new Text(nombre);
        StackPane stack = new StackPane();
        stack.getChildren().addAll(nuevo, text);
        stack.setLayoutX((this.anchoCapa - this.anchoBloque)/2);
        try {
            int anteriorY = (int) (this.capa.getChildren().get(this.capa.getChildren().size() - 1)).getLayoutY();
            Arrow nuevaFlecha = new Arrow((this.anchoCapa)/2,anteriorY + this.altoBloque,(this.anchoCapa)/2,anteriorY+(this.anchoBloque/2));
            this.capa.getChildren().add(nuevaFlecha);
            stack.setLayoutY(anteriorY + 60);
        }
        catch (Exception e){
            stack.setLayoutY(margen);
        }
        if (stack.getLayoutY()+40 > altoCapa){
            this.capa.setPrefHeight(stack.getLayoutY()+40);
            this.altoCapa = (int) (stack.getLayoutY() + 40);
        }
        this.capa.getChildren().add(stack);
    }

    @Override
    public void refrescar() {
        this.getChildren().remove(this.capa);
        this.capa = nuevaCapa(this.anchoCapa,this.altoCapa);
        this.scrollPane.setContent(this.capa);
        //this.getChildren().add(this.capa);
        //this.scrollPane.setContent(this.capa);
        ArrayList<Bloque> bloquesActuales = this.controlador.obtenerSecuencia();
        for (int counter = 0; counter < bloquesActuales.size(); counter++) {
            this.agregarBloque(bloquesActuales.get(counter).getNombre());
        }
    }
}
