package vista;

import controller.Controlador;
import controller.InvocadorControl;
import eventos.HandlerLapizArriba;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonLapizArriba extends Button {
    public BotonLapizArriba(Controlador controlador) {
        Image lapizArriba = new Image("lapiz arriba.jpg");
        ImageView view = new ImageView(lapizArriba);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerLapizArriba(controlador));
    }
}
