package vista;

import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerBotonColorRojo;

public class BotonColorRojo extends Button{
    public BotonColorRojo(Controlador controlador) {
        super();
        this.setStyle("-fx-background-color: red;");
        this.setPrefSize(22, 20);
        this.setOnAction(new HandlerBotonColorRojo(controlador));
    }
}