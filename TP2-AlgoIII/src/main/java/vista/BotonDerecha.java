package vista;


import controller.Controlador;
import controller.InvocadorControl;
import javafx.scene.control.Button;
import eventos.HandlerDerecha;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonDerecha extends Button {
    public BotonDerecha(Controlador controlador) {
        Image bloqueDerecha = new Image("derecha.png");
        ImageView view = new ImageView(bloqueDerecha);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerDerecha(controlador));
    }
}