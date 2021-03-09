package vista;

import eventos.HandlerBotonColorAzul;
import controller.Controlador;
import javafx.scene.control.Button;

public class BotonColorAzul extends Button{
    public BotonColorAzul(Controlador controlador) {
        super();
        this.setStyle("-fx-background-color: blue;");
        this.setPrefSize(22, 20);
        this.setOnAction(new HandlerBotonColorAzul(controlador));
    }
}
