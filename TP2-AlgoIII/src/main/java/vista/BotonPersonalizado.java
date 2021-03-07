package vista;

import controller.Controlador;
import eventos.HandlerPersonalizado;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.sector_bloques.Invocador;

public class BotonPersonalizado extends Button {
    BotonPersonalizado(Stage stage, Controlador invControl, Invocador invocador){
        Image personalizado = new Image("personalizado.jpg");
        ImageView view = new ImageView(personalizado);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerPersonalizado(stage, invControl, invocador));
    }
}
