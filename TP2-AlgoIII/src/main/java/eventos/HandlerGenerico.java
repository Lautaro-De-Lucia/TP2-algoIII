package eventos;

import vista.AreaBloques;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import vista.VistaTablero;

public class HandlerGenerico implements EventHandler<ActionEvent> {

    private VistaTablero tablero;
    private AreaBloques area;
    public HandlerGenerico(VistaTablero controlador, AreaBloques area){
        this.tablero = controlador;
        this.area = area;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        area.agregarBloque("BLOQUE TEST");
    }

    /*
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Generico Handler");
    }
     */
}