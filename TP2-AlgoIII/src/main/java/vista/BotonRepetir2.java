package vista;

import controller.Controlador;
import eventos.HandlerRepetir;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.sector_bloques.Invocador;

public class BotonRepetir2 extends Button{
    BotonRepetir2(Stage stage, Controlador invControl, Invocador invocador, int repeticiones){
        Image botonRepetir2 = new Image("repetir 2.jpg");
        ImageView view = new ImageView(botonRepetir2);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerRepetir(stage, invControl, invocador,repeticiones));
    }
}
