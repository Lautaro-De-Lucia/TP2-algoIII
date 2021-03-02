package vista;

import controller.InvocadorControl;
import eventos.HandlerLapizArriba;
import javafx.scene.control.Button;

public class BotonLapizArriba extends Button {
    public BotonLapizArriba(InvocadorControl invocador) {
        super();
        this.setText("Boton Lapiz Arriba");
        this.setMinHeight(20);
        this.setOnAction(new HandlerLapizArriba(invocador));
    }
}
