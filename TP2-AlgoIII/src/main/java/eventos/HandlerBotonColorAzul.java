package eventos;

import controller.Controlador;
import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_dibujo.SectorDibujo;
import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Azul;

public class HandlerBotonColorAzul implements EventHandler<ActionEvent> {
    private Controlador controlador;
    public HandlerBotonColorAzul(Controlador controlador){
        this.controlador = controlador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque color = new Azul();
        this.controlador.agregarBloque(color);
    }
}
