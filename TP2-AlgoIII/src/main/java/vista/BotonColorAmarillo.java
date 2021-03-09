package vista;

import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerBotonColorAmarillo;

public class BotonColorAmarillo extends Button{
    public BotonColorAmarillo(Controlador controlador) {
        super();
        this.setStyle("-fx-background-color: yellow;");
        this.setPrefSize(22, 20);
        this.setOnAction(new HandlerBotonColorAmarillo(controlador));
    }
}
