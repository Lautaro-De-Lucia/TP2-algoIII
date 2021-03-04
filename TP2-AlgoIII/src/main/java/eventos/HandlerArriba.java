package eventos;

import controller.Controlador;
import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Arriba;
import modelo.sector_bloques.Bloque;

public class HandlerArriba implements EventHandler<ActionEvent>  {

    private Controlador controlador;

    public HandlerArriba(Controlador controlador) {
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque nuevo = new Arriba();
        controlador.agregarBloque(nuevo);
    }
}