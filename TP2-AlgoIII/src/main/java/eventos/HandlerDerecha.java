package eventos;

import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Derecha;
import vista.VistaTablero;

public class HandlerDerecha implements EventHandler<ActionEvent>  {

    private InvocadorControl controlador;
    public HandlerDerecha(InvocadorControl controlador){
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque nuevo = new Derecha();
        this.controlador.agregarBloque(nuevo);
    }
}