package vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import modelo.Observador;
import modelo.sector_dibujo.*;


public class VistaTablero extends Group implements Observador {
    public int anchoPersonaje = 64;
    public int altoPersonaje = 64;
    public int anchoTablero;
    public int altoTablero;
    private int grosorLinea = 5;
    public int dimensionOriginal;

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

        personaje = nuevoPersonaje(ancho,alto);

        capaPersonaje.getChildren().add(personaje);
        this.getChildren().add(capaLineas);
        this.getChildren().add(capaPersonaje);
    }

    public void dibujarLinea(int xChange, int yChange, modelo.sector_dibujo.Color color){
        Line nuevaLinea = new Line();
        nuevaLinea.setStartX(personaje.getX());
        nuevaLinea.setStartY(personaje.getY());
        nuevaLinea.setEndX(xChange);
        nuevaLinea.setEndY(altoTablero-yChange);
        nuevaLinea.setStrokeWidth(grosorLinea);
        if (color == modelo.sector_dibujo.Color.NULO) {
            nuevaLinea.setStroke(Color.TRANSPARENT);
        }
        this.capaLineas.getChildren().add(nuevaLinea);

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

    @Override
    public void refrescar() {
        Posicion actual = new Posicion((int)this.personaje.getX()/50, (int) ((this.personaje.getY()/50)));
        Personaje personaje = sectorDibujo.obtenerPersonaje();
        Posicion personajePos = personaje.obtenerPosicion();


        Posicion nuevaPos = new Posicion(personajePos.obtenerCoordX(),personajePos.obtenerCoordY());
        Posicion testPos = new Posicion(actual.obtenerCoordX(),this.dimensionOriginal-actual.obtenerCoordY());
        Linea aDibujar = sectorDibujo.obtenerLinea(testPos,nuevaPos);
        dibujarLinea(personajePos.obtenerCoordX()*50,personajePos.obtenerCoordY()*50, aDibujar.getColor());
        moverPersonaje(personajePos.obtenerCoordX()*50,personajePos.obtenerCoordY()*50, personaje.obtenerLapiz().obtenerColor());
    }
}