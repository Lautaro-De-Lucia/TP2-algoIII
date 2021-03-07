package vista;

import controller.Controlador;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import controller.InvocadorControl;
import eventos.HandlerAbajo;

public class BotonAbajo extends Button {
    public BotonAbajo(Controlador invControl) {
        Image bloqueAbajo = new Image("abajo.jpg");
        ImageView view = new ImageView(bloqueAbajo);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerAbajo(invControl));
    }
}