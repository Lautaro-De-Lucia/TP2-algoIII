package vista;

import controller.Controlador;
import controller.InvocadorControl;
import eventos.HandlerIzquierda;
import javafx.scene.control.Button;

public class BotonIzquierda extends Button {
    public BotonIzquierda(Controlador controlador) {
        super();
        this.setText("Boton Izquierda");
        //this.setMinHeight(20);
        //this.autosize();
        this.setPrefSize(160,40);
        this.setOnAction(new HandlerIzquierda(controlador));
    }
}