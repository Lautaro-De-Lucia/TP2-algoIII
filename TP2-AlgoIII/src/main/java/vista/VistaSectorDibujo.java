package vista;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;


public class VistaSectorDibujo {
    VBox vistaDibujo = new VBox();

    VistaSectorDibujo(){
        vistaDibujo.setPrefHeight(250);
        vistaDibujo.setPrefWidth(250);
        vistaDibujo.setStyle("-fx-border-color: black;");

        Label nombre = new Label("Dibujo");
        vistaDibujo.setMargin(nombre, new Insets(5, 5, 5, 5));
        vistaDibujo.getChildren().add(nombre);
    }
    VBox getVista(){
        return vistaDibujo;
    }
}
