package vista;

import controller.Controlador;
import eventos.HandlerLimpiar;
import eventos.HandlerLimpiarAux;
import javafx.scene.control.Button;

public class BotonLimpiarAux extends Button {
    public BotonLimpiarAux(Controlador invocador) {
        super();
        this.setText("Limpiar Secuencia");
        this.setMinHeight(20);
        this.setOnAction(new HandlerLimpiarAux(invocador));
    }
}
