package sector_dibujo;
import java.util.LinkedList;


public class SectorDibujo {
    
	private Personaje personaje;
    private LinkedList<Linea> tablero;
    
    private static SectorDibujo sectorDibujo = new SectorDibujo();
    
    public static SectorDibujo obtenerInstancia() {
    	return sectorDibujo;
    }

    public SectorDibujo( ){
        this.personaje = new Personaje();
        this.tablero = new LinkedList<Linea>();
    }

    public void agregarLinea(Linea linea ){
        (this.tablero).add(linea);
    }
    
    public void abajo(){
        Direccion sur = new Direccion();
        sur.sur();
    	personaje.mover(sur);
    }

    public void arriba(){
        Direccion norte = new Direccion();
        norte.norte();
    	personaje.mover(norte);
    }

    public void derecha(){
        Direccion este = new Direccion();
        este.este();
    	personaje.mover(este);
    }

    public void izquierda(){
        Direccion oeste = new Direccion();
        oeste.oeste();
    	personaje.mover(oeste);
    	}

    public void bajarLapiz(){this.personaje.bajarLapiz();}

    public void levantarLapiz(){this.personaje.levantarLapiz();}

    public void ponerBorrador(){this.personaje.ponerLapizEnBorrador();}

    public Linea ObtenerLinea(){return this.tablero.getFirst();}
    
}
