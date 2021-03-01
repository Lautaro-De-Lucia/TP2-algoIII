package eventos;


import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import vista.VistaTablero;

public class HandlerLimpiarTablero implements EventHandler<ActionEvent> {

    private VistaTablero tablero;

    public HandlerLimpiarTablero(VistaTablero tablero) {
        this.tablero = tablero;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        this.tablero.reiniciarTablero();
    }
}
