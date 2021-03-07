package vista;


import controller.Controlador;
import controller.InvocadorControl;
import eventos.HandlerLapizAbajo;
import eventos.HandlerLapizArriba;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonLapizAbajo extends Button {
    public BotonLapizAbajo(Controlador controlador) {
        Image lapizAbajo = new Image("lapiz abajo.jpg");
        ImageView view = new ImageView(lapizAbajo);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerLapizAbajo(controlador));
    }
}
