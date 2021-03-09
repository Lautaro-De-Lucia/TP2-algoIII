package vista;

import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerBotonColorNegro;

public class BotonColorNegro extends Button{
    public BotonColorNegro(Controlador controlador) {
        super();
        this.setStyle("-fx-background-color: black;");
        this.setPrefSize(22, 20);
        this.setOnAction(new HandlerBotonColorNegro(controlador));
    }
}
