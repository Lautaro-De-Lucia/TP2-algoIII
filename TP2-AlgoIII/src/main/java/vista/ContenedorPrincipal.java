package vista;

import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import controller.InvocadorControl;
import modelo.sector_bloques.Invocador;

public class ContenedorPrincipal extends BorderPane{

    Invocador invocador = new Invocador();
    InvocadorControl invocadorControl = new InvocadorControl(invocador);
    VistaTablero tablero = new VistaTablero(800,800);
    AreaBloques areaBloques = new AreaBloques(384,712,invocadorControl);


    public ContenedorPrincipal() {
        this.setStyle("-fx-background-color: #94DBF2");
        invocador.addObserver(areaBloques);


        VBox sectorBloques = new ObtenerBotonera(invocadorControl,invocador);


        VBox sectorDibujo = new VBox();
        Label labelPersonaje = new Label("Area Personaje");
        labelPersonaje.setAlignment(Pos.CENTER);
        labelPersonaje.setPrefSize(800,40);
        labelPersonaje.setStyle("-fx-font: 16 arial");

        sectorDibujo.getChildren().add(labelPersonaje);
        sectorDibujo.getChildren().add(tablero);

        VBox sectorAlgoritmo = new VBox();
        Label labelBloques = new Label("Area Algoritmo");
        labelBloques.setAlignment(Pos.CENTER);
        labelBloques.setPrefSize(384,40);
        labelBloques.setStyle("-fx-font: 16 arial");

        sectorAlgoritmo.getChildren().add(labelBloques);
        sectorAlgoritmo.getChildren().add(areaBloques);
        sectorAlgoritmo.getChildren().add(new BotonEjecutar(invocadorControl, tablero));
        sectorAlgoritmo.getChildren().add(new BotonLimpiar(invocadorControl,tablero));
        sectorAlgoritmo.getChildren().add(new BotonBorrarUltimo(invocadorControl));

        this.setLeft(sectorDibujo);
        this.setCenter(sectorAlgoritmo);
        this.setRight(sectorBloques);
        this.setAlignment(sectorDibujo, Pos.TOP_CENTER);
        this.setAlignment(sectorAlgoritmo, Pos.TOP_CENTER);
        this.setAlignment(sectorBloques, Pos.TOP_CENTER);
        this.setMargin(sectorAlgoritmo, new Insets(12,12,12,12));
        this.setMargin(sectorDibujo, new Insets(12,12,12,12));
        this.setMargin(sectorBloques, new Insets(12,12,12,12));

    }

}
