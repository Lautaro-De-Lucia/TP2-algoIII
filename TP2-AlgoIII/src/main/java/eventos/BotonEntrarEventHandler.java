package eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BotonEntrarEventHandler implements EventHandler<ActionEvent> {
    Stage stage;
    Scene proximaEscena;

    public BotonEntrarEventHandler(Stage stage, Scene proximaEscena) {
        this.stage = stage;
        this.proximaEscena = proximaEscena;
    }

    public void handle(ActionEvent actionEvent) {
        this.stage.setScene(this.proximaEscena);
        this.stage.setFullScreenExitHint("");
        this.stage.setFullScreen(true);
    }

}