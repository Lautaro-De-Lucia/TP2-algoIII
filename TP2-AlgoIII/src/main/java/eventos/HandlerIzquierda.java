package eventos;

import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Izquierda;


public class HandlerIzquierda implements EventHandler<ActionEvent>  {

    private InvocadorControl controlador;
    public HandlerIzquierda(InvocadorControl controlador){
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque nuevo = new Izquierda();
        this.controlador.agregarBloque(nuevo);
    }
}