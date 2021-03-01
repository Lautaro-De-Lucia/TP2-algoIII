package vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import modelo.Observador;
import modelo.sector_dibujo.*;

import java.util.ArrayList;

public class VistaTablero extends Group implements Observador {
    public int anchoPersonaje = 32;
    public int altoPersonaje = 32;
    public int anchoTablero;
    public int altoTablero;
    private int grosorLinea = 5;

    private Pane capaLineas;
    private Pane capaPersonaje;
    private ImageView personaje;
    private SectorDibujo sectorDibujo;

    public VistaTablero(int ancho, int alto){
        this.sectorDibujo = SectorDibujo.obtenerInstancia();
        sectorDibujo.addObserver(this);

        capaPersonaje = new Pane();
        capaPersonaje.setStyle("-fx-background-color: transparent");

        capaLineas = crearCapaLineas(ancho,alto);

        anchoTablero = ancho;
        altoTablero = alto;

        personaje = nuevoPersonaje(ancho,alto);

        capaPersonaje.getChildren().add(personaje);
        this.getChildren().add(capaLineas);
        this.getChildren().add(capaPersonaje);
    }

    public void dibujarLinea(int xChange, int yChange){
        Line nuevaLinea = new Line();
        nuevaLinea.setStartX(personaje.getX());
        nuevaLinea.setStartY(personaje.getY());
        nuevaLinea.setEndX(xChange);
        nuevaLinea.setEndY(altoTablero-yChange);
        nuevaLinea.setStrokeWidth(grosorLinea);

        this.capaLineas.getChildren().add(nuevaLinea);

    }

    public void moverPersonaje(int posX, int posY){
        this.personaje.setX(posX);
        this.personaje.setY(altoTablero - posY);
    }

    public void establecerLapiz(Lapiz lapizactual){
    }

    public Pane crearCapaLineas(int ancho, int alto){
        Pane nuevaCapaLineas = new Pane();
        nuevaCapaLineas.setStyle("-fx-background-color: lightblue;");
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

        personaje.setImage(new Image("https://i.imgur.com/zJRogCp.jpeg"));

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
        this.getChildren().add(nuevaCapa);
    }

    @Override
    public void refrescar() {
        Posicion actual = new Posicion((int)this.personaje.getX()/50, (int) ((this.personaje.getY()/50)));
        //System.out.println("PosActual X" + actual.obtenerCoordX() + " Y " + actual.obtenerCoordY());
        Personaje personaje = sectorDibujo.obtenerPersonaje();
        dibujarLinea(personaje.obtenerPosicion().obtenerCoordX()*50,personaje.obtenerPosicion().obtenerCoordY()*50);
        moverPersonaje(personaje.obtenerPosicion().obtenerCoordX()*50,personaje.obtenerPosicion().obtenerCoordY()*50);
        //System.out.println("PosFin X" + personaje.obtenerPosicion().obtenerCoordX() + "  Y" + personaje.obtenerPosicion().obtenerCoordY());
        Linea aDibujar = sectorDibujo.obtenerLinea(actual,personaje.obtenerPosicion());
        //System.out.println("linea desde:" + aDibujar.getPunto1().obtenerCoordX() + " y " + aDibujar.getPunto1().obtenerCoordY());
        //System.out.println("hasta X" + aDibujar.getPunto2().obtenerCoordX() + " y " + aDibujar.getPunto2().obtenerCoordY());
        //System.out.println(aDibujar.getColor());

    }

}