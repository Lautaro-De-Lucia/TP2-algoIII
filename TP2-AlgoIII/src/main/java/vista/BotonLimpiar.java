package vista;

import controller.Controlador;
import eventos.HandlerLimpiar;
import javafx.scene.control.Button;

public class BotonLimpiar extends Button {
    public BotonLimpiar(Controlador invocador, VistaTablero tablero) {
        super();
        this.setText("Limpiar Secuencia");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(384,40);
        this.setOnAction(new HandlerLimpiar(invocador,tablero));
    }
}