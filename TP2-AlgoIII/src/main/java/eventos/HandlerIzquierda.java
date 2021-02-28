package eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class HandlerIzquierda implements EventHandler<ActionEvent>  {
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Izquierda Handler");
    }
}