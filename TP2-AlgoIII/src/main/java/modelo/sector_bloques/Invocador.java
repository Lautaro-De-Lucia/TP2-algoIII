package modelo.sector_bloques;
import modelo.Observable;
import modelo.Observador;
import modelo.sector_dibujo.SectorDibujo;

import java.util.*;


public class Invocador implements Observable {

	SectorDibujo sectorDibujo = SectorDibujo.obtenerInstancia();
	ArrayList<Bloque> colaDeBloques = new ArrayList<Bloque>();
	private ArrayList<Observador> observadores;

	public Invocador(){
		observadores = new ArrayList<Observador>();
	}

	public void agregarBloque(Bloque bloque) {
		colaDeBloques.add(bloque);
		avisarObservadores();
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
