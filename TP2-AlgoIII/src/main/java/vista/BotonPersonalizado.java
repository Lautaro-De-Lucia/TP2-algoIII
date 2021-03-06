package vista;

import controller.Controlador;
import eventos.HandlerPersonalizado;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import modelo.sector_bloques.Invocador;

public class BotonPersonalizado extends Button {
    BotonPersonalizado(Stage stage, Controlador invControl, Invocador invocador){
        super();
        this.setText("Personalizado");
        //this.setMinHeight(20);
        this.setPrefSize(160,40);
        this.setOnAction(new HandlerPersonalizado(stage, invControl, invocador));
    }
}
