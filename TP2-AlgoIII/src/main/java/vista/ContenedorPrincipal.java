package vista;

import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sector_dibujo.SectorDibujo;

public class ContenedorPrincipal extends BorderPane{

    VistaSectorDibujo vistaSectorDibujo = new VistaSectorDibujo();
    //VistaSectorBloques vistaSectorBloques = new VistaSectorBloques();
    VistaSectorSecuencia vistaSectorSecuencia = new VistaSectorSecuencia();

    public ContenedorPrincipal(Stage primaryStage, SectorDibujo tablero) {
        this.setVistaSectorDibujo();
      //  this.setVistaSectorBloques();
        this.setVistaSectorSecuencia();
    }

    private void setVistaSectorDibujo(){
        this.setLeft(this.vistaSectorDibujo.getVista());
    }

    //private void setVistaSectorBloques(){ this.setRight(this.vistaSectorBloques.getVista()); }

    private void setVistaSectorSecuencia(){
        this.setCenter(this.vistaSectorSecuencia.getVista());
    }
}
