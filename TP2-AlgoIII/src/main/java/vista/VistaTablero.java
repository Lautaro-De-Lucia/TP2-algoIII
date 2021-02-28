package vista;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;

public class VistaTablero extends Group {
    public int anchoPersonaje = 32;
    public int altoPersonaje = 32;
    private int grosorLinea = 5;

    private Pane capaLineas;
    private Pane capaPersonaje;
    private ImageView personaje;

    public VistaTablero(int ancho, int alto){
        capaPersonaje = new Pane();
        capaPersonaje.setStyle("-fx-background-color: transparent");
        capaLineas = new Pane();
        capaLineas.setStyle("-fx-background-color: lightblue;");
        capaLineas.setPrefSize(ancho,alto);

        personaje = new ImageView();
        personaje.setScaleX(1);
        personaje.setScaleY(1);
        personaje.setFitHeight(altoPersonaje);
        personaje.setFitWidth(anchoPersonaje);

        personaje.setImage(new Image("https://i.imgur.com/zJRogCp.jpeg"));

        capaPersonaje.getChildren().add(personaje);
        this.getChildren().add(capaLineas);
        this.getChildren().add(capaPersonaje);
    }

    public void drawtest(int xChange, int yChange){
        Line nuevaLinea = new Line();
        nuevaLinea.setStartX(personaje.getX()+(anchoPersonaje /2));
        nuevaLinea.setStartY(personaje.getY()+(altoPersonaje /2));
        nuevaLinea.setEndX(nuevaLinea.getStartX()+xChange);
        nuevaLinea.setEndY(nuevaLinea.getStartY()+yChange);
        nuevaLinea.setStrokeWidth(grosorLinea);
        this.personaje.setX(nuevaLinea.getEndX()-(anchoPersonaje /2));
        this.personaje.setY(nuevaLinea.getEndY()-(altoPersonaje /2));

        this.capaLineas.getChildren().add(nuevaLinea);

    }

}