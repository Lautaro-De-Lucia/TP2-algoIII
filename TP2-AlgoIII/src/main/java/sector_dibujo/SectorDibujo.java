package sector_dibujo;
import java.util.*;


public class SectorDibujo {
    
	private Personaje personaje;
    private ArrayList<Linea> tablero;
    private static final int dimension = 5;
    
    private static SectorDibujo sectorDibujo = new SectorDibujo();
    
    public static SectorDibujo obtenerInstancia() {
    	return sectorDibujo;
    }

    public SectorDibujo( ){
        this.personaje = new Personaje();
        this.tablero = new ArrayList<Linea>();
        //Inicializamos el tablero con lineas nulas
        for(int j = 0; j <= SectorDibujo.dimension ; j++) {
        	for (int i = 0; i < SectorDibujo.dimension; i++) {
        		Posicion posicion1 = new Posicion(i,j);
        		Posicion posicion2 = new Posicion(i+1,j);
        		tablero.add(new LineaNula(posicion1,posicion2));
        	}
        }
    }

    public void agregarLinea(Linea nuevaLinea ){
        for (int i = 0; i < (this.tablero).size(); i++) {  
            if(this.tablero.get(i).igualA(nuevaLinea)) {
            	this.tablero.set(i, nuevaLinea);
            }
        } 
    }
    
    public Linea obtenerLinea (Posicion posicion1, Posicion posicion2) {
    	
    	for (int i = 0; i < this.tablero.size(); i++) {
    		if(this.tablero.get(i).igualA(new Linea(posicion1,posicion2))) {
    			return this.tablero.get(i);
    		}
    	}
    	//Si los parámetros estan fuera del rango del tablero aún debemos devolver una linea
    	//¿Como se manejaría esto? ¿Con excepciones?
    	//En C devolveríamos un tipo enumerativo ERROR_NOT_IN_TABLERO
    	//¿Cómo hacemos en java si hay un error pero el método aún así exige que se devuelva una Linea?
    	return new LineaNula(new Posicion(0,0), new Posicion(0,0));
    	
    	
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
    
}
