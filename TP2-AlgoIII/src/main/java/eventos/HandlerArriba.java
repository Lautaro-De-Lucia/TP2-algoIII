package eventos;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class HandlerArriba implements EventHandler<ActionEvent>  {
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Arriba Handler");
    }
}