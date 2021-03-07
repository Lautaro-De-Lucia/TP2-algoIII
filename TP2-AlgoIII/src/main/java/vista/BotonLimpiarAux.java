package vista;

import controller.Controlador;
import eventos.HandlerLimpiarAux;
import javafx.scene.control.Button;

public class BotonLimpiarAux extends Button {
    public BotonLimpiarAux(Controlador invocador) {
        super();
        this.setText("Limpiar Secuencia");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(256,40);
        this.setOnAction(new HandlerLimpiarAux(invocador));
    }
}
