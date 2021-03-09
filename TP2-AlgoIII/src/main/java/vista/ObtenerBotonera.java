package vista;

import controller.Controlador;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.sector_bloques.Invocador;
import javafx.scene.layout.HBox;

public class ObtenerBotonera extends VBox {

    public ObtenerBotonera(Controlador controlador, Invocador invocador){
        super();
        VBox bloquesMov = new VBox();
        HBox coloresCaja = new HBox();
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
        coloresCaja.getChildren().add(new BotonColorAzul(controlador));
        coloresCaja.getChildren().add(new BotonColorAmarillo(controlador));
        coloresCaja.getChildren().add(new BotonColorBlanco(controlador));
        coloresCaja.getChildren().add(new BotonColorNaranja(controlador));
        coloresCaja.getChildren().add(new BotonColorNegro(controlador));
        coloresCaja.getChildren().add(new BotonColorRojo(controlador));
        coloresCaja.getChildren().add(new BotonColorVerde(controlador));
        coloresCaja.getChildren().add(new BotonColorVioleta(controlador));
        VBox bloquesCompuestos = new VBox();
        Label labelCompuestos = new Label("Bloques Compuestos");
        labelCompuestos.setAlignment(Pos.CENTER);
        labelCompuestos.setPrefSize(160,40);
        labelCompuestos.setStyle("-fx-font: 16 arial");

        Stage stageAux = new Stage();
        bloquesCompuestos.getChildren().add(labelCompuestos);
        bloquesCompuestos.getChildren().add(new BotonInvertir(stageAux,controlador,invocador));
        bloquesCompuestos.getChildren().add(new BotonRepetir2(stageAux,controlador,invocador,2));
        bloquesCompuestos.getChildren().add(new BotonRepetir3(stageAux,controlador,invocador,3));
        bloquesCompuestos.getChildren().add(new BotonPersonalizado(stageAux,controlador,invocador));

        this.getChildren().add(bloquesMov);
        this.getChildren().add(bloquesLapiz);
        this.getChildren().add(coloresCaja);
        this.getChildren().add(bloquesCompuestos);

    }
}
