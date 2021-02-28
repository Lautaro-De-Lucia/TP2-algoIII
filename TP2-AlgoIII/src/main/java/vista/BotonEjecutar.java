package vista;

import eventos.HandlerEjecutar;
import controller.InvocadorControl;
import javafx.scene.control.Button;

public class BotonEjecutar extends Button {
    public BotonEjecutar(InvocadorControl invControl) {
        super();
        this.setText("Ejecutar");
        this.setMinHeight(20);
        this.setOnAction(new HandlerEjecutar(invControl));
    }
}