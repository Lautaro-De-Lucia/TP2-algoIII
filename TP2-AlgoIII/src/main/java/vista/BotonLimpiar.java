package vista;

import controller.Controlador;
import controller.InvocadorControl;
import eventos.HandlerLimpiar;
import eventos.HandlerLimpiarTablero;
import javafx.scene.control.Button;

public class BotonLimpiar extends Button {
    public BotonLimpiar(Controlador invocador, VistaTablero tablero) {
        super();
        this.setText("Limpiar Secuencia");
        this.setMinHeight(20);
        this.setOnAction(new HandlerLimpiar(invocador,tablero));
    }
}
