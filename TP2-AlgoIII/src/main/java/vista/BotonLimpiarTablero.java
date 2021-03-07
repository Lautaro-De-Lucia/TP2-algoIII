package vista;

import eventos.HandlerLimpiarTablero;
import javafx.scene.control.Button;

public class BotonLimpiarTablero extends Button {
    public BotonLimpiarTablero(VistaTablero tablero) {
        super();
        this.setText("Limpiar Tablero");
        this.setStyle("-fx-font-size: 16");
        this.setMinHeight(20);
        this.setOnAction(new HandlerLimpiarTablero(tablero));
    }
}