package vista;

import controller.Controlador;
import controller.InvocadorControl;
import eventos.HandlerIzquierda;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonIzquierda extends Button {
    public BotonIzquierda(Controlador controlador) {
        Image bloqueIzquierda = new Image("izquierda.jpg");
        ImageView view = new ImageView(bloqueIzquierda);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerIzquierda(controlador));
    }
}