package eventos;

import controller.Controlador;
import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Izquierda;


public class HandlerIzquierda implements EventHandler<ActionEvent>  {

    private Controlador controlador;
    public HandlerIzquierda(Controlador controlador){
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque nuevo = new Izquierda();
        this.controlador.agregarBloque(nuevo);
    }
}