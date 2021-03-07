package vista;

import eventos.HandlerEjecutar;
import controller.InvocadorControl;
import javafx.scene.control.Button;

public class BotonEjecutar extends Button {
    public BotonEjecutar(InvocadorControl invControl, VistaTablero tablero) {
        super();
        this.setText("Ejecutar");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(256,40);
        this.setOnAction(new HandlerEjecutar(invControl, tablero));
    }
}