package eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import vista.VistaTablero;

public class HandlerDerecha implements EventHandler<ActionEvent>  {

    private VistaTablero tablero;
    public HandlerDerecha(VistaTablero controlador){
        this.tablero = controlador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        this.tablero.drawtest(25,0);
    }
    /*
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Derecha Handler");
    }
     */
}