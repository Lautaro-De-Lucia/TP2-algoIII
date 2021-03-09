package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Rojo;

public class HandlerBotonColorRojo implements EventHandler<ActionEvent> {
    private Controlador controlador;
    public HandlerBotonColorRojo(Controlador controlador){
        this.controlador = controlador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque color = new Rojo();
        this.controlador.agregarBloque(color);
    }
}