package eventos;

import controller.Controlador;
import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerLimpiarAux implements EventHandler<ActionEvent> {

    private Controlador controlador;

    public HandlerLimpiarAux(Controlador controlador) {
        this.controlador = controlador;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        this.controlador.limpiar();
    }
}
