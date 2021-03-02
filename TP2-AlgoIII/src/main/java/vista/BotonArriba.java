package vista;
import controller.InvocadorControl;
import javafx.scene.control.Button;
import eventos.HandlerArriba;

public class BotonArriba extends Button {
    public BotonArriba(InvocadorControl invControl) {
        super();
        this.setText("Boton Arriba");
        this.setMinHeight(20);
        this.setOnAction(new HandlerArriba(invControl));
    }
}