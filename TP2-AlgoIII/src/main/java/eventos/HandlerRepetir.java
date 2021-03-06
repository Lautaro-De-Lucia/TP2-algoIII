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

public class HandlerRepetir implements EventHandler<ActionEvent> {
    private Stage stage;
    private Controlador invC;
    private Invocador invocador;
    private int repeticiones;

    public HandlerRepetir(Stage primaryStage, Controlador invControl, Invocador invocador, int repeticiones){
        this.stage = primaryStage;
        this.invC = invControl;
        this.invocador = invocador;
        this.repeticiones = repeticiones;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        BloqueCompuesto invertir = new Repetir(repeticiones);
        ContenedorAux ventanaAux = new ContenedorAux(invocador, invC, invertir);
        Scene escenaAux = new Scene(ventanaAux, 600,850);
        stage.setScene(escenaAux);
        stage.show();
    }
}