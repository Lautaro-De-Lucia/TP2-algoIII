package eventos;

import controller.Controlador;
import controller.InvocadorControl;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.sector_dibujo.SectorDibujo;
import vista.VistaTablero;

public class HandlerLimpiar implements EventHandler<ActionEvent> {

    private Controlador controlador;
    private VistaTablero tablero;

    public HandlerLimpiar(Controlador controlador, VistaTablero tablero) {
        this.controlador = controlador;
        this.tablero = tablero;
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        this.tablero.reiniciarTablero();
        SectorDibujo.obtenerInstancia().reiniciarTablero();
        this.controlador.limpiar();
    }
}
