package vista;

import eventos.HandlerGenerico;
import javafx.scene.control.Button;
import vista.VistaTablero;
import vista.AreaBloques;

public class BotonGenerico extends Button {
    public BotonGenerico(VistaTablero a, AreaBloques aa) {
        super();
        this.setText("Agregar Boton Prueba");
        this.setMinHeight(20);
        this.setOnAction(new HandlerGenerico(a, aa));
    }
}