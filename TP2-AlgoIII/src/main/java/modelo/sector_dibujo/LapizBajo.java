package modelo.sector_dibujo;
import excepciones.FueraDeLimiteExcepcion;

public class LapizBajo extends Lapiz {

    public void trazar(Posicion coordenada1, Posicion coordenada2){

        SectorDibujo tablero = SectorDibujo.obtenerInstancia();
        
        
        try {
        	tablero.agregarLinea(new LineaSolida(coordenada1, coordenada2, this.colorLapiz));
        }
        
        catch(FueraDeLimiteExcepcion e) {
        	System.out.println("Linea fuera de limites");
        }
        
    }

}
