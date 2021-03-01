package modelo.sector_dibujo;
import modelo.Observable;
import modelo.Observador;

import java.util.*;


public class SectorDibujo implements Observable {
    
	private Personaje personaje;
    private ArrayList<Linea> tablero;
    public static final int dimension = 16; // posicion inicial de personaje = (8, 8)
    private ArrayList<Observador> observadores;
    
    private static SectorDibujo sectorDibujo = new SectorDibujo();
    
    public static SectorDibujo obtenerInstancia() {
    	return sectorDibujo;
    }

    @Override
    public void addObserver(Observador observador) {
        observadores.add(observador);
    }


    public SectorDibujo(){
        this.personaje = new Personaje();
        this.tablero = new ArrayList<Linea>();
        this.observadores = new ArrayList<Observador>();
        
        //Inicializamos el tablero con lineas nulas
        
        //Lineas horizontales
        
        for(int j = 0; j <= SectorDibujo.dimension ; j++) {
        	for (int i = 0; i < SectorDibujo.dimension; i++) {
        		Posicion posicion1 = new Posicion(i,j);
        		Posicion posicion2 = new Posicion(i+1,j);
        		tablero.add(new LineaNula(posicion1,posicion2));
        	}
        }
        
        //Lineas verticales
        
        for(int i = 0; i < SectorDibujo.dimension ; i++) {
        	for (int j = 0; j <= SectorDibujo.dimension; j++) {
        		Posicion posicion1 = new Posicion(i,j);
        		Posicion posicion2 = new Posicion(i,j+1);
        		tablero.add(new LineaNula(posicion1,posicion2));
        	}
        }
    }

    public void agregarLinea(Linea nuevaLinea){
        for (int i = 0; i < (this.tablero).size(); i++) {
            if(this.tablero.get(i).mismaUbicacion(nuevaLinea)) {
            	this.tablero.set(i, nuevaLinea);
            	
            }
        } 
    }

    public Linea obtenerLinea(Posicion posicion1, Posicion posicion2) {
    	
    	for (int i = 0; i < this.tablero.size(); i++) {
    		if((this.tablero.get(i).getPunto1().igualA(posicion1)) && (this.tablero.get(i).getPunto2().igualA(posicion2))) {
    			return this.tablero.get(i);
    		}
    		if((this.tablero.get(i).getPunto1().igualA(posicion2)) && (this.tablero.get(i).getPunto2().igualA(posicion1))) {
    			return this.tablero.get(i);
    		}
    	}
    	
    	return new LineaNula(new Posicion(0,0), new Posicion(0,0));
    }
    
    public Personaje obtenerPersonaje() {
    	return this.personaje;
    }
    
    public void abajo(){
        Direccion sur = new Direccion();
        sur.sur();
    	personaje.mover(sur);
        avisarObservadores();
    }

    public void arriba(){
        Direccion norte = new Direccion();
        norte.norte();
    	personaje.mover(norte);
        avisarObservadores();
    }

    public void derecha(){
        Direccion este = new Direccion();
        este.este();
    	personaje.mover(este);
        avisarObservadores();
    }

    public void izquierda(){
        Direccion oeste = new Direccion();
        oeste.oeste();
    	personaje.mover(oeste);
        avisarObservadores();
    }

    public void bajarLapiz(){this.personaje.bajarLapiz();}

    public void levantarLapiz(){this.personaje.levantarLapiz();}

    public void ponerBorrador(){this.personaje.ponerLapizEnBorrador();}
    
    public void reiniciarTablero() {
    	
    	this.personaje = new Personaje();
    	
    	//Lineas horizontales
        
        for(int j = 0; j <= SectorDibujo.dimension ; j++) {
        	for (int i = 0; i < SectorDibujo.dimension; i++) {
        		Posicion posicion1 = new Posicion(i,j);
        		Posicion posicion2 = new Posicion(i+1,j);
        		tablero.add(new LineaNula(posicion1,posicion2));
        	}
        }
        
        //Lineas verticales
        
        for(int i = 0; i < SectorDibujo.dimension ; i++) {
        	for (int j = 0; j <= SectorDibujo.dimension; j++) {
        		Posicion posicion1 = new Posicion(i,j);
        		Posicion posicion2 = new Posicion(i,j+1);
        		tablero.add(new LineaNula(posicion1,posicion2));
        	}
        }
    }


    @Override
    public void avisarObservadores() {
        observadores.stream().forEach(observer -> observer.refrescar());
    }
    
}
