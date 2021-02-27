package vista;

import eventos.BotonEntrarEventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ContenedorBienvenidos extends StackPane{
    Stage stage;

    public ContenedorBienvenidos(Stage stage, Scene proximaEscena){
        this.stage = stage;
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20.0D));

        Button botonEntrar = new Button();
        botonEntrar.setText("Comenzar Juego");

        Image imagen = new Image("https://i.imgur.com/h7uGZvQ.png");
        ImageView mv = new ImageView(imagen);
        mv.fitWidthProperty().bind(stage.widthProperty());
        mv.setPreserveRatio(true);

        this.getChildren().add(mv);
        this.getChildren().add(botonEntrar);
        botonEntrar.setTranslateY(50);
        botonEntrar.setTranslateX(35);

        BotonEntrarEventHandler botonEntrarHandler = new BotonEntrarEventHandler(stage, proximaEscena);
        botonEntrar.setOnAction(botonEntrarHandler);

    }
}
