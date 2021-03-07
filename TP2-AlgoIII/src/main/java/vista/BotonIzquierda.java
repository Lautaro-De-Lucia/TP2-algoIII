package vista;

import controller.Controlador;
import eventos.HandlerIzquierda;
import javafx.scene.control.Button;

public class BotonIzquierda extends Button {
    public BotonIzquierda(Controlador controlador) {
        super();
        this.setText("Boton Izquierda");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(160,60);
        this.setOnAction(new HandlerIzquierda(controlador));
    }
}