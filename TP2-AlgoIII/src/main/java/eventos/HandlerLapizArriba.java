package eventos;

import controller.Controlador;
import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.LapizArriba;

public class HandlerLapizArriba implements EventHandler<ActionEvent> {

    private Controlador controlador;
    public HandlerLapizArriba(Controlador controlador){
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque nuevo = new LapizArriba();
        this.controlador.agregarBloque(nuevo);
    }
}
