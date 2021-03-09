package vista;

import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerBotonColorBlanco;

public class BotonColorBlanco extends Button{
    public BotonColorBlanco(Controlador controlador) {
        super();
        this.setStyle("-fx-background-color: white;");
        this.setPrefSize(22, 20);
        this.setOnAction(new HandlerBotonColorBlanco(controlador));
    }
}
