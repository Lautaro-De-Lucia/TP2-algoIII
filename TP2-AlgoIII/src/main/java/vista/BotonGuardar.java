package vista;

import controller.Controlador;
import eventos.HandlerGuardar;
import javafx.scene.control.Button;

public class BotonGuardar extends Button {
    public BotonGuardar(Controlador compControl) {
        super();
        this.setText("Guardar");
        this.setPrefSize(384,40);
        this.setStyle("-fx-font-size: 16");
        this.setOnAction(new HandlerGuardar(compControl));
    }
}