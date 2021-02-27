package vista;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class VistaSectorSecuencia {
    VBox vistaSecuencia = new VBox();

    VistaSectorSecuencia(){
        vistaSecuencia.setPrefWidth(400);
        vistaSecuencia.setPrefHeight(400);
        vistaSecuencia.setStyle("-fx-border-color: black;");

        Label nombre = new Label("Secuencia");
        vistaSecuencia.setMargin(nombre, new Insets(5, 5, 5, 5));
        vistaSecuencia.getChildren().add(nombre);
    }

    VBox getVista() {
        return vistaSecuencia;
    }
}
