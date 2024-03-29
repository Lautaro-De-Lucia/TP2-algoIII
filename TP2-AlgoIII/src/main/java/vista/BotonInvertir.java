package vista;

import controller.Controlador;
import eventos.HandlerInvertir;
import eventos.HandlerPersonalizado;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.sector_bloques.Invocador;

public class BotonInvertir extends Button {
    BotonInvertir(Stage stage, Controlador invControl, Invocador invocador){
        Image invertir = new Image("invertir.jpg");
        ImageView view = new ImageView(invertir);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerInvertir(stage, invControl, invocador));
    }
}
