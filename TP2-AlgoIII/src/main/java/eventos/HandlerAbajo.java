package eventos;

import controller.Controlador;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Abajo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import controller.InvocadorControl;

public class HandlerAbajo implements EventHandler<ActionEvent> {

    private Controlador controlador;
    public HandlerAbajo(Controlador controlador){
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent){
        Bloque nuevo = new Abajo();
        controlador.agregarBloque(nuevo);
    }
}