package vista;

import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import vista.Arrow;

public class AreaBloques extends Group{
    private Pane capa;
    private int altoCapa;
    private int anchoCapa;
    private int anchoBloque = 120;
    private int altoBloque = 40;
    private int margen = 12;

    public AreaBloques(int ancho, int alto){
        capa = new Pane();
        capa.setStyle("-fx-background-color: lightblue;");
        capa.setPrefSize(ancho,alto);
        this.altoCapa = alto;
        this.anchoCapa = ancho;
        this.getChildren().add(capa);
    }

    public void agregarBloque(String nombre){
        Rectangle nuevo = new Rectangle();
        nuevo.setHeight(altoBloque);
        nuevo.setWidth(anchoBloque);
        nuevo.setFill(Color.GREENYELLOW);
        Text text = new Text(nombre);
        StackPane stack = new StackPane();
        stack.getChildren().addAll(nuevo, text);
        stack.setLayoutX((this.anchoCapa - this.anchoBloque)/2);
        try {
            int anteriorY = (int) (this.capa.getChildren().get(this.capa.getChildren().size() - 1)).getLayoutY();
            Arrow nuevaFlecha = new Arrow((this.anchoCapa)/2,anteriorY + this.altoBloque,(this.anchoCapa)/2,anteriorY+(this.anchoBloque/2));
            this.capa.getChildren().add(nuevaFlecha);
            stack.setLayoutY(anteriorY + 60);
        }
        catch (Exception e){
            stack.setLayoutY(margen);
        }
        this.capa.getChildren().add(stack);
    }

}