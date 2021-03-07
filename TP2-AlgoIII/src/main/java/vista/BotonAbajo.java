package vista;

import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerAbajo;

public class BotonAbajo extends Button {
    public BotonAbajo(Controlador invControl) {
        super();
        this.setText("Boton Abajo");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(160,60);
        this.setOnAction(new HandlerAbajo(invControl));
    }
}