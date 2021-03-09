package vista;

import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerBotonColorVerde;

public class BotonColorVerde extends Button{
    public BotonColorVerde(Controlador controlador) {
        super();
        this.setStyle("-fx-background-color: green;");
        this.setPrefSize(22, 20);
        this.setOnAction(new HandlerBotonColorVerde(controlador));
    }
}