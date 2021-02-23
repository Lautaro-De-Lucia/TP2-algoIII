package sector_dibujo;
import java.util.LinkedList;


public class SectorDibujo {
    private Personaje personaje;
    private LinkedList<Linea> tablero;

    public SectorDibujo( ){
        this.personaje = new Personaje();
        this.tablero = new LinkedList<Linea>();
    }

    public void abajo(){
        Direccion sur = new Direccion();
        sur.sur();
    	this.tablero.add(personaje.mover(sur));
    }

    public void arriba(){
        Direccion norte = new Direccion();
        norte.norte();
    	this.tablero.add(personaje.mover(norte));
    }

    public void derecha(){
        Direccion este = new Direccion();
        este.este();
    	this.tablero.add(personaje.mover(este));
    }

    public void izquierda(){
        Direccion oeste = new Direccion();
        oeste.oeste();
    	this.tablero.add(personaje.mover(oeste));    
    	}

    public void bajarLapiz(){
        this.personaje.bajarLapiz();
    }

    public void levantarLapiz(){
        this.personaje.levantarLapiz();
    }

    public void ponerBorrador(){
        this.personaje.ponerLapizEnBorrador();
    }

    public Linea ObtenerLinea(){
        return this.tablero.getFirst();
    }
}
