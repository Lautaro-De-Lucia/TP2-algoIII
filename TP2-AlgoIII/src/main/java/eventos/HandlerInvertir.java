package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.sector_bloques.BloqueCompuesto;
import modelo.sector_bloques.Invertir;
import modelo.sector_bloques.Invocador;
import vista.ContenedorAux;

public class HandlerInvertir implements EventHandler<ActionEvent> {

    //private Controlador controlador;
    private Stage stage;
    private Controlador invC;
    private Invocador invocador;
    public HandlerInvertir(Stage primaryStage, Controlador invControl, Invocador invocador){
        //this.controlador = controlador;
        this.stage = primaryStage;
        this.invC = invControl;
        this.invocador = invocador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        BloqueCompuesto invertir = new Invertir();
        ContenedorAux ventanaAux = new ContenedorAux(invocador, invC, invertir);
        Scene escenaAux = new Scene(ventanaAux, 600,850);
        stage.setScene(escenaAux);
        stage.show();
    }
}
