package vista;


import controller.Controlador;
import controller.InvocadorControl;
import eventos.HandlerLapizAbajo;
import eventos.HandlerLapizArriba;
import javafx.scene.control.Button;

public class BotonLapizAbajo extends Button {
    public BotonLapizAbajo(Controlador controlador) {
        super();
        this.setText("Boton Lapiz Abajo");
        this.setMinHeight(20);
        this.setOnAction(new HandlerLapizAbajo(controlador));
    }
}
