package vista;

import controller.Controlador;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.sector_bloques.Invocador;

public class ObtenerBotonera extends VBox {

    public ObtenerBotonera(Controlador controlador, Invocador invocador){
        super();
        VBox bloquesMov = new VBox();
        Label labelMov = new Label("Bloques Movimiento");
        labelMov.setAlignment(Pos.CENTER);
        labelMov.setPrefSize(160,40);
        labelMov.setStyle("-fx-font: 16 arial");

        bloquesMov.getChildren().add(labelMov);
        bloquesMov.getChildren().add(new BotonArriba(controlador));
        bloquesMov.getChildren().add(new BotonAbajo(controlador));
        bloquesMov.getChildren().add(new BotonDerecha(controlador));
        bloquesMov.getChildren().add(new BotonIzquierda(controlador));

        VBox bloquesLapiz= new VBox();
        Label labelLapiz = new Label("Bloques Lapiz");
        labelLapiz.setAlignment(Pos.CENTER);
        labelLapiz.setStyle("-fx-font: 16 arial");

        labelLapiz.setPrefSize(160,40);
        bloquesLapiz.getChildren().add(labelLapiz);
        bloquesLapiz.getChildren().add(new BotonLapizAbajo(controlador));
        bloquesLapiz.getChildren().add(new BotonLapizArriba(controlador));


        VBox bloquesCompuestos = new VBox();
        Label labelCompuestos = new Label("Bloques Compuestos");
        labelCompuestos.setAlignment(Pos.CENTER);
        labelCompuestos.setPrefSize(160,40);
        labelCompuestos.setStyle("-fx-font: 16 arial");

        Stage stageAux = new Stage();
        bloquesCompuestos.getChildren().add(labelCompuestos);
        bloquesCompuestos.getChildren().add(new BotonInvertir(stageAux,controlador,invocador));
        bloquesCompuestos.getChildren().add(new BotonRepetir(stageAux,controlador,invocador,2));
        bloquesCompuestos.getChildren().add(new BotonRepetir(stageAux,controlador,invocador,3));
        bloquesCompuestos.getChildren().add(new BotonPersonalizado(stageAux,controlador,invocador));

        this.getChildren().add(bloquesMov);
        this.getChildren().add(bloquesLapiz);
        this.getChildren().add(bloquesCompuestos);

    }
}
