package vista;
import controller.Controlador;
import controller.InvocadorControl;
import javafx.scene.control.Button;
import eventos.HandlerArriba;
import javafx.scene.control.Control;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BotonArriba extends Button {
    public BotonArriba(Controlador controlador) {
        Image bloqueArriba = new Image("arriba.jpg");
        ImageView view = new ImageView(bloqueArriba);
        view.setFitHeight(55);
        view.setPreserveRatio(true);
        view.setSmooth(true);
        super.setPrefSize(30,20);
        super.setGraphic(view);
        this.setOnAction(new HandlerArriba(controlador));
    }
}