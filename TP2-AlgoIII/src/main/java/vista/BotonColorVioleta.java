package vista;

import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerBotonColorVioleta;

public class BotonColorVioleta extends Button{
    public BotonColorVioleta(Controlador controlador) {
        super();
        this.setStyle("-fx-background-color: purple;");
        this.setPrefSize(22, 20);
        this.setOnAction(new HandlerBotonColorVioleta(controlador));
    }
}