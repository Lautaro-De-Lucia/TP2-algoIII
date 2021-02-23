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
        this.tablero.addLast(personaje.mover(new sur()));
    }

    public void arriba(){
        this.tablero.addLast(personaje.mover(new norte()));
    }

    public void derecha(){
        this.tablero.addLast(personaje.mover(new este()));
    }

    public void izquierda(){
        this.tablero.addLast(personaje.mover(new oeste()));
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
