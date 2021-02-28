package vista;
import javafx.scene.control.Button;
import eventos.HandlerArriba;

public class BotonArriba extends Button {
    public BotonArriba() {
        super();
        this.setText("Boton Arriba");
        this.setMinHeight(20);
        this.setOnAction(new HandlerArriba());
    }
}