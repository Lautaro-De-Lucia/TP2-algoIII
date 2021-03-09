package modelo.sector_dibujo;
import excepciones.FueraDeLimiteExcepcion;

public class LapizEnBorrador extends Lapiz {

    public void trazar(Posicion posicion1, Posicion posicion2){

        Posicion coordenada1 = new Posicion(posicion1);
        Posicion coordenada2 = new Posicion(posicion2);

        SectorDibujo tablero = SectorDibujo.obtenerInstancia();
        
        try {
        	tablero.agregarLinea(new LineaNula(coordenada1, coordenada2));
        }
        catch(FueraDeLimiteExcepcion e) {
        	System.out.println("Linea fuera de limites");
        }

    }
	
}
