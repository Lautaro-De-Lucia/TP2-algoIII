package vista;

import controller.Controlador;
import controller.InvocadorControl;
import eventos.HandlerLapizBorrador;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonLapizBorrador extends Button {
    public BotonLapizBorrador(Controlador controlador) {
        Image lapizBorrador = new Image("borrador.png");
        ImageView view = new ImageView(lapizBorrador);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerLapizBorrador(controlador));
    }
}