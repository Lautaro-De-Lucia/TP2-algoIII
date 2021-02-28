package vista;


import javafx.scene.control.Button;
import eventos.HandlerDerecha;

public class BotonDerecha extends Button {
    public BotonDerecha(VistaTablero a) {
        super();
        this.setText("Boton Derecha");
        this.setMinHeight(20);
        this.setOnAction(new HandlerDerecha(a));
    }
}