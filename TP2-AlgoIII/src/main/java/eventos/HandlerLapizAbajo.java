package eventos;

import controller.Controlador;
import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.LapizAbajo;

public class HandlerLapizAbajo implements EventHandler<ActionEvent> {

    private Controlador controlador;
    public HandlerLapizAbajo(Controlador controlador){
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque nuevo = new LapizAbajo();
        this.controlador.agregarBloque(nuevo);
    }
}
