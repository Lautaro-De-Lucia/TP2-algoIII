package vista;


import controller.Controlador;
import eventos.HandlerLapizAbajo;
import javafx.scene.control.Button;

public class BotonLapizAbajo extends Button {
    public BotonLapizAbajo(Controlador controlador) {
        super();
        this.setText("Boton Lapiz Abajo");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(160,60);
        this.setOnAction(new HandlerLapizAbajo(controlador));
    }
}
