package vista;

import controller.CompuestosControl;
import controller.Controlador;
import controller.InvocadorControl;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.sector_bloques.BloqueCompuesto;
import modelo.sector_bloques.Invocador;

public class ContenedorAux extends BorderPane{

    public ContenedorAux(Invocador invocador, Controlador invControl, BloqueCompuesto bloqueCompuesto) {

        InvocadorControl invocadorControl = (InvocadorControl) invControl;

        CompuestosControl controlCompuesto = new CompuestosControl(bloqueCompuesto, invocadorControl);


        AreaBloques pg = new AreaBloques(256,712, controlCompuesto);
        bloqueCompuesto.addObserver(pg);
        VBox bloquesMov = new VBox();
        Label labelMov = new Label("Bloques Movimiento");

        bloquesMov.getChildren().add(labelMov);
        bloquesMov.getChildren().add(new BotonArriba(controlCompuesto));
        bloquesMov.getChildren().add(new BotonAbajo(controlCompuesto));
        bloquesMov.getChildren().add(new BotonDerecha(controlCompuesto));
        bloquesMov.getChildren().add(new BotonIzquierda(controlCompuesto));

        VBox bloquesLapiz= new VBox();
        Label labelLapiz = new Label("Bloques Lapiz");
        bloquesLapiz.getChildren().add(labelLapiz);
        bloquesLapiz.getChildren().add(new BotonLapizAbajo(controlCompuesto));
        bloquesLapiz.getChildren().add(new BotonLapizArriba(controlCompuesto));


        VBox bloquesCompuestos = new VBox();
        Label labelCompuestos = new Label("Bloques Compuestos");
        Stage stageAux = new Stage();
        bloquesCompuestos.getChildren().add(labelCompuestos);
        bloquesCompuestos.getChildren().add(new BotonInvertir(stageAux,invocadorControl,invocador));
        bloquesCompuestos.getChildren().add(new BotonRepetir2(stageAux,invocadorControl,invocador));
        bloquesCompuestos.getChildren().add(new BotonPersonalizado(stageAux,invocadorControl,invocador));

        VBox sectorBloques= new VBox();
        sectorBloques.getChildren().add(bloquesMov);
        sectorBloques.getChildren().add(bloquesLapiz);
        sectorBloques.getChildren().add(bloquesCompuestos);


        VBox sectorAlgoritmo = new VBox();
        Label labelBloques = new Label("Area Algoritmo");
        sectorAlgoritmo.getChildren().add(labelBloques);
        sectorAlgoritmo.getChildren().add(pg);
        sectorAlgoritmo.getChildren().add(new BotonGuardar(controlCompuesto));
        sectorAlgoritmo.getChildren().add(new BotonLimpiar(controlCompuesto));
        sectorAlgoritmo.getChildren().add(new BotonBorrarUltimo(controlCompuesto));

        this.setCenter(sectorAlgoritmo);
        this.setRight(sectorBloques);
        this.setAlignment(sectorAlgoritmo, Pos.TOP_CENTER);
        this.setAlignment(sectorBloques, Pos.TOP_CENTER);
        this.setMargin(sectorAlgoritmo, new Insets(12,12,12,12));
        this.setMargin(sectorBloques, new Insets(12,12,12,12));

    }

}