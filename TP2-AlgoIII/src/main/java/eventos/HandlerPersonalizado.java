package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.sector_bloques.BloqueCompuesto;
import modelo.sector_bloques.Invocador;
import vista.ContenedorAux;

public class HandlerPersonalizado implements EventHandler<ActionEvent> {
    private Stage stage;
    private Controlador invC;
    private Invocador invocador;
    public HandlerPersonalizado(Stage primaryStage, Controlador invControl, Invocador invocador){
        //this.controlador = controlador;
        this.stage = primaryStage;
        this.invC = invControl;
        this.invocador = invocador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        BloqueCompuesto personalizado = new BloqueCompuesto();
        ContenedorAux ventanaAux = new ContenedorAux(invocador, invC, personalizado);
        Scene escenaAux = new Scene(ventanaAux, 600,900);
        stage.setScene(escenaAux);
        stage.show();
    }
}