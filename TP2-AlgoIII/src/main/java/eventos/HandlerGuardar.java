package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.stage.Stage;

public class HandlerGuardar implements EventHandler<ActionEvent> {

    private Controlador compControl;

    public HandlerGuardar(Controlador nuevoControl){
        this.compControl = nuevoControl;

    }

    @Override
    public void handle(ActionEvent event) {
        this.compControl.ejecutar();
        Node node = (Node) event.getSource();
        Stage thisStage = (Stage) node.getScene().getWindow();
        thisStage.close();
    }
}
