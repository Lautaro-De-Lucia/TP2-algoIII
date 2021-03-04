package modelo.sector_bloques;
import modelo.Observable;
import modelo.Observador;

import java.util.ArrayList;

public class BloqueCompuesto extends Bloque implements Observable {

	ArrayList<Bloque> bloques = new ArrayList<Bloque>();
	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	String nombre = "Personalizado";

	public void agregarBloque(Bloque bloque) {
		bloques.add(bloque);
		this.avisarObservadores();
	}

	public void ejecutar() {
		for (Bloque bloque : bloques) {bloque.ejecutar();}
	}

	public void revertirSecuencia() {
		for (Bloque bloque : bloques) {bloque.ejecutarOpuesto();}
	}

	public ArrayList<Bloque> obtenerSecuencia(){
		return bloques;
	}

	//Remueve el ultimo bloque que se agregó
	public void quitarBloque() {
		bloques.remove((bloques.size()-1));
	}

	//Remueve todos los bloques
	public void limpiarBloques() {
		bloques.clear();

	}
	@Override
	public String getNombre() {
		return nombre;
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
