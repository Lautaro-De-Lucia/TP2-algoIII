package vista;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import modelo.sector_dibujo.SectorDibujo;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{


        primaryStage.setTitle("Algo-Blocks");

        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal();

        Scene escenaJuego = new Scene(contenedorPrincipal, 1440.0D, 900.0D);

        ContenedorBienvenidos contenedorBienvenidos = new ContenedorBienvenidos(primaryStage, escenaJuego);

        Scene escenaBienvenidos = new Scene(contenedorBienvenidos, 640.0D, 600.0D);
        primaryStage.setScene(escenaBienvenidos);

        primaryStage.show();

    }

    private SectorDibujo crearTablero(){
        SectorDibujo tablero = new SectorDibujo();

        return tablero;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
