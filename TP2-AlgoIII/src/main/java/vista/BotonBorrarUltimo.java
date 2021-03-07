package vista;

import controller.Controlador;
import eventos.HandlerBorrarUltimo;
import javafx.scene.control.Button;

public class BotonBorrarUltimo extends Button {
    public BotonBorrarUltimo(Controlador controlador) {
        super();
        this.setText("Borrar Ultimo Bloque");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(384,40);
        this.setOnAction(new HandlerBorrarUltimo(controlador));
    }
}