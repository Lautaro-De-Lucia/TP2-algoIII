package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Blanco;

public class HandlerBotonColorBlanco implements EventHandler<ActionEvent> {
    private Controlador controlador;
    public HandlerBotonColorBlanco(Controlador controlador){
        this.controlador = controlador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque color = new Blanco();
        this.controlador.agregarBloque(color);
    }
}