package eventos;

import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.LapizAbajo;

public class HandlerLapizAbajo implements EventHandler<ActionEvent> {

    private InvocadorControl controlador;
    public HandlerLapizAbajo(InvocadorControl controlador){
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque nuevo = new LapizAbajo();
        this.controlador.agregarBloque(nuevo);
    }
}
