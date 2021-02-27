import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sector_dibujo.SectorDibujo;
import vista.ContenedorBienvenidos;
import vista.ContenedorPrincipal;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Algo-Blocks");
        SectorDibujo tablero = this.crearTablero();

        ContenedorPrincipal contenedorPrincipal = new ContenedorPrincipal(primaryStage, tablero);

        Scene escenaJuego = new Scene(contenedorPrincipal, 640.0D, 480.0D);

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
