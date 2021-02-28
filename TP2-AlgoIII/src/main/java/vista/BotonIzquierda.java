package vista;

import eventos.HandlerIzquierda;
import javafx.scene.control.Button;

public class BotonIzquierda extends Button {
    public BotonIzquierda() {
        super();
        this.setText("Boton Izquierda");
        this.setMinHeight(20);
        this.setOnAction(new HandlerIzquierda());
    }
}