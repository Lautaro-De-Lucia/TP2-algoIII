package vista;


import controller.Controlador;
import javafx.scene.control.Button;
import eventos.HandlerDerecha;

public class BotonDerecha extends Button {
    public BotonDerecha(Controlador controlador) {
        super();
        this.setText("Boton Derecha");
        //this.setMinHeight(20);
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(160,40);
        this.setOnAction(new HandlerDerecha(controlador));
    }
}
