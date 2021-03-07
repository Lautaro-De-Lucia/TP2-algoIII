package vista;

import controller.Controlador;
import eventos.HandlerInvertir;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.sector_bloques.Invocador;

public class BotonInvertir extends Button {
    BotonInvertir(Stage stage, Controlador invControl, Invocador invocador){
        super();
        this.setText("Invertir");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(160,60);
        this.setOnAction(new HandlerInvertir(stage, invControl, invocador));
    }
}
