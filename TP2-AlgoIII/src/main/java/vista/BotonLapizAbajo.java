package vista;


import controller.InvocadorControl;
import eventos.HandlerLapizArriba;
import javafx.scene.control.Button;

public class BotonLapizAbajo extends Button {
    public BotonLapizAbajo(InvocadorControl invocador) {
        super();
        this.setText("Boton Lapiz Arriba");
        this.setMinHeight(20);
        this.setOnAction(new HandlerLapizArriba(invocador));
    }
}
