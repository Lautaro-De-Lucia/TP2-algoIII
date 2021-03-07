package vista;

import controller.CompuestosControl;
import controller.Controlador;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import modelo.sector_bloques.BloqueCompuesto;
import modelo.sector_bloques.Invocador;

public class ContenedorAux extends BorderPane{

    public ContenedorAux(Invocador invocador, Controlador controlador, BloqueCompuesto bloqueCompuesto) {
        this.setStyle("-fx-background-color: #94DBF2");

        CompuestosControl controlCompuesto = new CompuestosControl(bloqueCompuesto, controlador);


        AreaBloques pg = new AreaBloques(384,712, controlCompuesto);
        bloqueCompuesto.addObserver(pg);

        VBox sectorBloques = new ObtenerBotonera(controlCompuesto,invocador);


        VBox sectorAlgoritmo = new VBox();
        Label labelBloques = new Label("Area Algoritmo");
        labelBloques.setAlignment(Pos.CENTER);
        labelBloques.setPrefSize(256,40);
        labelBloques.setStyle("-fx-font: 16 arial");
        sectorAlgoritmo.getChildren().add(labelBloques);
        sectorAlgoritmo.getChildren().add(pg);
        sectorAlgoritmo.getChildren().add(new BotonGuardar(controlCompuesto));
        sectorAlgoritmo.getChildren().add(new BotonLimpiarAux(controlCompuesto));
        sectorAlgoritmo.getChildren().add(new BotonBorrarUltimo(controlCompuesto));

        this.setCenter(sectorAlgoritmo);
        this.setRight(sectorBloques);
        this.setAlignment(sectorAlgoritmo, Pos.TOP_CENTER);
        this.setAlignment(sectorBloques, Pos.TOP_CENTER);
        this.setMargin(sectorAlgoritmo, new Insets(12,12,12,12));
        this.setMargin(sectorBloques, new Insets(12,12,12,12));

    }

}