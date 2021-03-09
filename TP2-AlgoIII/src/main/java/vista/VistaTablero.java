package vista;

import javafx.scene.Group;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import modelo.Observador;
import modelo.sector_dibujo.*;

import java.util.ArrayList;

import excepciones.FueraDeLimiteExcepcion;


public class VistaTablero extends Group implements Observador {
    public int anchoPersonaje = 64;
    public int altoPersonaje = 64;
    public int anchoTablero;
    public int altoTablero;
    private int grosorLinea = 5;
    public int dimensionOriginal;
    public int escala;

    private Pane capaLineas;
    private Pane capaPersonaje;
    private ImageView personaje;
    private SectorDibujo sectorDibujo;

    public VistaTablero(int ancho, int alto){
        this.sectorDibujo = SectorDibujo.obtenerInstancia();
        sectorDibujo.addObserver(this);
        this.dimensionOriginal = sectorDibujo.getDimension();


        capaPersonaje = new Pane();
        capaPersonaje.setStyle("-fx-background-color: transparent");

        capaLineas = crearCapaLineas(ancho,alto);

        anchoTablero = ancho;
        altoTablero = alto;
        this.escala = ancho/dimensionOriginal;

        personaje = nuevoPersonaje(ancho,alto);

        capaPersonaje.getChildren().add(personaje);
        this.getChildren().add(capaLineas);
        this.getChildren().add(capaPersonaje);
    }

    public void moverPersonaje(int posX, int posY, modelo.sector_dibujo.Color colorActual){
        if (colorActual == modelo.sector_dibujo.Color.NULO){
            this.personaje.setImage(new Image("pinguinoArriba.png"));
            System.out.println("arriba");
        }else {
            this.personaje.setImage(new Image("pinguinoAbajo.png"));
        }
        this.personaje.setX(posX);
        this.personaje.setY(altoTablero - posY);
    }


    public Pane crearCapaLineas(int ancho, int alto){
        Pane nuevaCapaLineas = new Pane();
        nuevaCapaLineas.setStyle("-fx-background-color: lightblue; -fx-background-image: url('fondo.png');");
        nuevaCapaLineas.setPrefSize(ancho,alto);
        return nuevaCapaLineas;
    }

    public ImageView nuevoPersonaje(int ancho, int alto){
        ImageView personaje = new ImageView();
        personaje.setScaleX(1);
        personaje.setScaleY(1);
        personaje.setFitHeight(altoPersonaje);
        personaje.setFitWidth(anchoPersonaje);
        personaje.setY(alto/2);
        personaje.setX(ancho/2);

        personaje.setImage(new Image("pinguinoAbajo.png"));

        return personaje;
    }

    public void reiniciarTablero(){
        Pane nuevaCapa = crearCapaLineas((int) this.capaLineas.getPrefWidth(),(int) this.capaLineas.getPrefHeight());
        this.getChildren().remove(this.capaLineas);
        this.capaLineas = nuevaCapa;

        ImageView nuevoPersonaje = nuevoPersonaje(this.anchoTablero,this.altoTablero);
        this.capaPersonaje.getChildren().remove(this.personaje);
        this.personaje = nuevoPersonaje;


        this.capaPersonaje.getChildren().add(nuevoPersonaje);
        this.getChildren().add(0,nuevaCapa);
    }

    public void dibujarLinea(Linea linea){
        Line nuevaLinea = new Line();
        nuevaLinea.setStartX(linea.getPunto1().obtenerCoordX()*escala);
        nuevaLinea.setStartY(this.altoTablero-linea.getPunto1().obtenerCoordY()*escala);
        nuevaLinea.setEndX(linea.getPunto2().obtenerCoordX()*escala);
        nuevaLinea.setEndY(this.altoTablero-linea.getPunto2().obtenerCoordY()*escala);
        nuevaLinea.setStrokeWidth(grosorLinea);
        switch (linea.getColor()){
            case NEGRO:
                nuevaLinea.setStroke(Color.BLACK);
                break;
            case AZUL:
                nuevaLinea.setStroke(Color.BLUE);
                break;
            case ROJO:
                nuevaLinea.setStroke(Color.RED);
                break;
            case VERDE:
                nuevaLinea.setStroke(Color.GREEN);
                break;
            case BLANCO:
                nuevaLinea.setStroke(Color.WHITE);
                break;
            case NARANJA:
                nuevaLinea.setStroke(Color.ORANGE);
                break;
            case VIOLETA:
                nuevaLinea.setStroke(Color.VIOLET);
                break;
            case AMARILLO:
                nuevaLinea.setStroke(Color.YELLOW);
                break;
        }
        this.capaLineas.getChildren().add(nuevaLinea);
    }

    public void dibujarLineas(){
        ArrayList<Linea> lineas = this.sectorDibujo.getLineas();
        for (int i = 0; i< lineas.size(); i++){
            if (lineas.get(i).getColor() != modelo.sector_dibujo.Color.NULO){
                dibujarLinea(lineas.get(i));
            }
        }
    }

    @Override
    public void refrescar() {
        Personaje personaje = sectorDibujo.obtenerPersonaje();
        Posicion personajePos = personaje.obtenerPosicion();

        dibujarLineas();
        moverPersonaje(personajePos.obtenerCoordX()*escala,personajePos.obtenerCoordY()*escala, personaje.obtenerLapiz().obtenerColor());
    }
}