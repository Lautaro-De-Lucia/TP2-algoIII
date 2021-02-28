package eventos;

import sector_bloques.Bloque;
import sector_bloques.Abajo;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import controller.InvocadorControl;

public class HandlerAbajo implements EventHandler<ActionEvent> {

    private InvocadorControl controlador;
    public HandlerAbajo(InvocadorControl controlador){
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent){
        Bloque nuevo = new Abajo();
        controlador.agregarBloque(nuevo);
    }

    /*
    private tableroControl controlador;
    public handlerAbajo(tableroControl controlador){
        this.controlador = controlador;
    }
    */
    /*
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Abajo Handler");
        // Bloque nuevoAbajo = new Abajo();
        //controlador.agregarbloque(nuevoAbajo);
    }
     */
}