package vista;
import controller.Controlador;
import controller.InvocadorControl;
import javafx.scene.control.Button;
import eventos.HandlerArriba;
import javafx.scene.control.Control;

public class BotonArriba extends Button {
    public BotonArriba(Controlador controlador) {
        super();
        this.setText("Boton Arriba");
        this.setMinHeight(20);
        this.setOnAction(new HandlerArriba(controlador));
    }
}