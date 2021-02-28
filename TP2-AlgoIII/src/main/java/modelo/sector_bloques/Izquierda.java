package modelo.sector_bloques;

public class Izquierda extends Bloque {
	
	public void ejecutar() {
		receptor.izquierda();
	}
	public void ejecutarOpuesto() {
		receptor.derecha();
	}

}
