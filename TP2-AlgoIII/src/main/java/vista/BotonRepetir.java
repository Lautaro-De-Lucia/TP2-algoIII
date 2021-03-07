package vista;

import controller.Controlador;
import eventos.HandlerRepetir;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.sector_bloques.Invocador;

public class BotonRepetir extends Button{
    BotonRepetir(Stage stage, Controlador invControl, Invocador invocador, int repeticiones){
        super();
        this.setText("Repetir "+ repeticiones +" veces");
        this.setStyle("-fx-font-size: 16");
        this.setPrefSize(160,60);
        this.setOnAction(new HandlerRepetir(stage, invControl, invocador,repeticiones));
    }
}
