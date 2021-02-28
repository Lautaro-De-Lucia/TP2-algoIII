package vista;


import controller.InvocadorControl;
import javafx.scene.control.Button;
import eventos.HandlerDerecha;

public class BotonDerecha extends Button {
    public BotonDerecha(InvocadorControl invControl) {
        super();
        this.setText("Boton Derecha");
        this.setMinHeight(20);
        this.setOnAction(new HandlerDerecha(invControl));
    }
}