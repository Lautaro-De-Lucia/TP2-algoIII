package vista;

import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerBotonColorNaranja;

public class BotonColorNaranja extends Button{
    public BotonColorNaranja(Controlador controlador) {
        super();
        this.setStyle("-fx-background-color: orange;");
        this.setPrefSize(22, 20);
        this.setOnAction(new HandlerBotonColorNaranja(controlador));
    }
}
