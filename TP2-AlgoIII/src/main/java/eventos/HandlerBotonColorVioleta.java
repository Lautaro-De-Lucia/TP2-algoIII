package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Violeta;

public class HandlerBotonColorVioleta implements EventHandler<ActionEvent> {
    private Controlador controlador;
    public HandlerBotonColorVioleta(Controlador controlador){
        this.controlador = controlador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque color = new Violeta();
        this.controlador.agregarBloque(color);
    }
}