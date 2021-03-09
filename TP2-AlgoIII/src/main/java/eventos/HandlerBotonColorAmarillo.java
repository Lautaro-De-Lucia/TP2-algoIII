package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Amarillo;

public class HandlerBotonColorAmarillo implements EventHandler<ActionEvent> {
    private Controlador controlador;
    public HandlerBotonColorAmarillo(Controlador controlador){
        this.controlador = controlador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque color = new Amarillo();
        this.controlador.agregarBloque(color);
    }
}