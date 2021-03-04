package vista;


import controller.Controlador;
import controller.InvocadorControl;
import javafx.scene.control.Button;
import eventos.HandlerDerecha;

public class BotonDerecha extends Button {
    public BotonDerecha(Controlador controlador) {
        super();
        this.setText("Boton Derecha");
        this.setMinHeight(20);
        this.setOnAction(new HandlerDerecha(controlador));
    }
}