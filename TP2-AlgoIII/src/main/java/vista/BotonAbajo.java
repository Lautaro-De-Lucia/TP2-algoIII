package vista;

import controller.Controlador;
import javafx.scene.control.Button;

import controller.InvocadorControl;
import eventos.HandlerAbajo;

public class BotonAbajo extends Button {
    public BotonAbajo(Controlador invControl) {
        super();
        this.setText("Boton Abajo");
        this.setMinHeight(20);
        this.setOnAction(new HandlerAbajo(invControl));
    }
}