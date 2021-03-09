package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Verde;

public class HandlerBotonColorVerde implements EventHandler<ActionEvent> {
    private Controlador controlador;
    public HandlerBotonColorVerde(Controlador controlador){
        this.controlador = controlador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque color = new Verde();
        this.controlador.agregarBloque(color);
    }
}