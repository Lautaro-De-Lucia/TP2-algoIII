package modelo.sector_bloques;

import modelo.Observable;
import modelo.Observador;

import java.util.ArrayList;

public class Invertir extends BloqueCompuesto implements Observable {
	String nombre = "Invertir";
	private ArrayList<Observador> observadores = new ArrayList<Observador>();

	public void ejecutaropuesto() {
		for (int i = bloques.size() - 1; i >= 0; i--) {
			bloques.get(i).ejecutar();
		}
	}

	public void ejecutar() {
		for (int i = bloques.size() - 1; i >= 0; i--) {
			bloques.get(i).ejecutarOpuesto();
		}
	}

	@Override
	public String getNombre() {
		return nombre;
	}

}