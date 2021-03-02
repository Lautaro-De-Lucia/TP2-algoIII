package vista;

import controller.InvocadorControl;
import eventos.HandlerIzquierda;
import javafx.scene.control.Button;

public class BotonIzquierda extends Button {
    public BotonIzquierda(InvocadorControl invControl) {
        super();
        this.setText("Boton Izquierda");
        this.setMinHeight(20);
        this.setOnAction(new HandlerIzquierda(invControl));
    }
}