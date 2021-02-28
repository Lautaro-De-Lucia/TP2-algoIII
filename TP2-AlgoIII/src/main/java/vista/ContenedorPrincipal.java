package vista;

import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import controller.InvocadorControl;
import modelo.sector_bloques.Invocador;
import vista.AreaBloques;

public class ContenedorPrincipal extends BorderPane{

    Invocador invocador = new Invocador();
    InvocadorControl invocadorControl = new InvocadorControl(invocador);
    VistaTablero tablero = new VistaTablero(512,512);
    AreaBloques pg = new AreaBloques(256,712,invocador);

    public ContenedorPrincipal(Stage primaryStage) {
        VBox bloquesMov = new VBox();
        Label labelMov = new Label("Bloques Movimiento");

        bloquesMov.getChildren().add(labelMov);
        bloquesMov.getChildren().add(new BotonArriba(invocadorControl));
        bloquesMov.getChildren().add(new BotonAbajo(invocadorControl));
        bloquesMov.getChildren().add(new BotonDerecha(invocadorControl));
        bloquesMov.getChildren().add(new BotonIzquierda(invocadorControl));

        VBox bloquesLapiz= new VBox();
        Label labelLapiz = new Label("Bloques Lapiz");
        bloquesLapiz.getChildren().add(labelLapiz);
        bloquesLapiz.getChildren().add(new BotonLapizAbajo(invocadorControl));
        bloquesLapiz.getChildren().add(new BotonLapizArriba(invocadorControl));

        VBox bloquesCompuestos = new VBox();
        Label labelCompuestos = new Label("Bloques Compuestos");
        bloquesCompuestos.getChildren().add(labelCompuestos);
        bloquesCompuestos.getChildren().add(new BotonGenerico(tablero,pg));
        bloquesCompuestos.getChildren().add(new BotonGenerico(tablero,pg));
        bloquesCompuestos.getChildren().add(new BotonGenerico(tablero,pg));

        VBox sectorBloques= new VBox();
        sectorBloques.getChildren().add(bloquesMov);
        sectorBloques.getChildren().add(bloquesLapiz);
        sectorBloques.getChildren().add(bloquesCompuestos);

        VBox sectorDibujo = new VBox();
        Label labelPersonaje = new Label("Area Personaje");
        sectorDibujo.getChildren().add(labelPersonaje);
        sectorDibujo.getChildren().add(tablero);

        VBox sectorAlgoritmo = new VBox();
        Label labelBloques = new Label("Area Algoritmo");
        sectorAlgoritmo.getChildren().add(labelBloques);
        sectorAlgoritmo.getChildren().add(pg);
        sectorAlgoritmo.getChildren().add(new BotonEjecutar(invocadorControl));

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
