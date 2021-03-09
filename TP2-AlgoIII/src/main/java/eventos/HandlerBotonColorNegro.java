package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Negro;

public class HandlerBotonColorNegro implements EventHandler<ActionEvent> {
    private Controlador controlador;
    public HandlerBotonColorNegro(Controlador controlador){
        this.controlador = controlador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque color = new Negro();
        this.controlador.agregarBloque(color);
    }
}