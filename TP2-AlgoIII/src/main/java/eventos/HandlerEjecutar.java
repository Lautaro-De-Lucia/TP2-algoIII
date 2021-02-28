package eventos;

import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerEjecutar implements EventHandler<ActionEvent> {

    private InvocadorControl controlador;

    public HandlerEjecutar(InvocadorControl controlador) {
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        this.controlador.ejecutar();
    }
}