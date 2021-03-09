package eventos;

import controller.Controlador;
import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.LapizBorrador;

public class HandlerLapizBorrador implements EventHandler<ActionEvent> {

    private Controlador controlador;
    public HandlerLapizBorrador(Controlador controlador){
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque nuevo = new LapizBorrador();
        this.controlador.agregarBloque(nuevo);
    }
}
