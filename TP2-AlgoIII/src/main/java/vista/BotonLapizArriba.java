package vista;

import controller.Controlador;
import eventos.HandlerLapizArriba;
import javafx.scene.control.Button;

public class BotonLapizArriba extends Button {
    public BotonLapizArriba(Controlador controlador) {
        super();
        this.setText("Boton Lapiz Arriba");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(160,60);
        this.setOnAction(new HandlerLapizArriba(controlador));
    }
}
