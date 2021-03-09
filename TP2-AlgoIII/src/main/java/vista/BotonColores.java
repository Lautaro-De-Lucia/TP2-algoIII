package vista;

import controller.Controlador;
import eventos.HandlerColores;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonColores extends Button {
    public BotonColores(Controlador controlador, ComboBox comboBox) {
        Image bloqueIzquierda = new Image("colores.jpg");
        ImageView view = new ImageView(bloqueIzquierda);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerColores(controlador,comboBox));
    }
}