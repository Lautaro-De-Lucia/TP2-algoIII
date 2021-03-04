package vista;

import controller.Controlador;
import eventos.HandlerRepetir2;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.sector_bloques.Invocador;

public class BotonRepetir2 extends Button{
    BotonRepetir2(Stage stage, Controlador invControl, Invocador invocador){
        super();
        this.setText("Repetir 2 veces");
        this.setMinHeight(20);
        this.setOnAction(new HandlerRepetir2(stage, invControl, invocador));
    }
}
