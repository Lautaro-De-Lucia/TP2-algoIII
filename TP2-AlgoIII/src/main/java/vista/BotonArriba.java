package vista;
import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerArriba;

public class BotonArriba extends Button {
    public BotonArriba(Controlador controlador) {
        super();
        this.setText("Boton Arriba");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(160,60);
        this.setOnAction(new HandlerArriba(controlador));
    }
}