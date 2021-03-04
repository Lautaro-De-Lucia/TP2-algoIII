package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.sector_bloques.BloqueCompuesto;
import modelo.sector_bloques.Invocador;
import modelo.sector_bloques.Repetir;
import vista.ContenedorAux;

public class HandlerRepetir2 implements EventHandler<ActionEvent> {
    private Stage stage;
    private Controlador invC;
    private Invocador invocador;
    public HandlerRepetir2(Stage primaryStage, Controlador invControl, Invocador invocador){
        //this.controlador = controlador;
        this.stage = primaryStage;
        this.invC = invControl;
        this.invocador = invocador;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        BloqueCompuesto invertir = new Repetir(2);
        ContenedorAux ventanaAux = new ContenedorAux(invocador, invC, invertir);
        Scene escenaAux = new Scene(ventanaAux, 600,800);
        stage.setScene(escenaAux);
        stage.show();
    }
}
