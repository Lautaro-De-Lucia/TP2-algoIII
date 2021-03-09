package modelo.sector_bloques;
import modelo.Observable;
import modelo.Observador;
import modelo.sector_dibujo.LineaSolida;
import modelo.sector_dibujo.SectorDibujo;

import java.util.*;

import excepciones.CantidadMaximaDeBloquesAlcanzadaExcepcion;



public class Invocador implements Observable {

	SectorDibujo sectorDibujo = SectorDibujo.obtenerInstancia();
	ArrayList<Bloque> colaDeBloques = new ArrayList<Bloque>();
	private ArrayList<Observador> observadores;
	
	private int maxLength = 200;

	public Invocador(){
		observadores = new ArrayList<Observador>();
	}

	public void agregarBloque(Bloque bloque) {
		
		try {
			_agregarBloque();
        }
        
        catch(CantidadMaximaDeBloquesAlcanzadaExcepcion e) {
        	System.out.println("Cantidad maxima de bloques alcanzada");
        }
		
		colaDeBloques.add(bloque);
		avisarObservadores();
	}
	
	public void _agregarBloque() {
		
		if(colaDeBloques.size() > maxLength) {
			throw new CantidadMaximaDeBloquesAlcanzadaExcepcion();
		}
		
		return;
	}
	
	

	public void ejecutarSecuencia() {
		sectorDibujo.reiniciarTablero();
		for (Bloque bloque : colaDeBloques) {bloque.ejecutar();}
	}

	public void revertirSecuencia() {
		for (Bloque bloque : colaDeBloques) {bloque.ejecutarOpuesto();}
	}

	public void limpiarSecuencia(){
		colaDeBloques = new ArrayList<Bloque>();
		avisarObservadores();
	}

	public void quitarBloque() {
		try {
			colaDeBloques.remove((colaDeBloques.size()-1));
		} catch (Exception e) {}
		avisarObservadores();
	}

	public ArrayList<Bloque> obtenerSecuencia(){
		return colaDeBloques;
	}

	@Override
	public void addObserver(Observador observador) {
		observadores.add(observador);
	}

	@Override
	public void avisarObservadores() {
		observadores.stream().forEach(observer -> observer.refrescar());
	}
}
