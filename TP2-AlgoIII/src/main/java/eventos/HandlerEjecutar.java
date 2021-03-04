package eventos;

import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import vista.VistaSectorDibujo;
import vista.VistaTablero;

public class HandlerEjecutar implements EventHandler<ActionEvent> {

    private InvocadorControl controlador;
    private VistaTablero tablero;

    public HandlerEjecutar(InvocadorControl controlador, VistaTablero tablero) {
        this.controlador = controlador;
        this.tablero = tablero;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        this.tablero.reiniciarTablero();
        this.controlador.ejecutar();
    }
}