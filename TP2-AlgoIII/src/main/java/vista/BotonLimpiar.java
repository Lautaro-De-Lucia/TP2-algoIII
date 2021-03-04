package vista;

import controller.Controlador;
import controller.InvocadorControl;
import eventos.HandlerLimpiar;
import javafx.scene.control.Button;

public class BotonLimpiar extends Button {
    public BotonLimpiar(Controlador invocador) {
        super();
        this.setText("Limpiar Secuencia");
        this.setMinHeight(20);
        this.setOnAction(new HandlerLimpiar(invocador));
    }
}
