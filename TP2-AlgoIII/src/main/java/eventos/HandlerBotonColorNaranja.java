package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Naranja;

public class HandlerBotonColorNaranja implements EventHandler<ActionEvent> {
    private Controlador controlador;
    public HandlerBotonColorNaranja(Controlador controlador){
        this.controlador = controlador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque color = new Naranja();
        this.controlador.agregarBloque(color);
    }
}