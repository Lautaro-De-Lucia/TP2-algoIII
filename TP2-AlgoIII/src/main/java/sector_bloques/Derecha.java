package sector_bloques;

public class Derecha extends Bloque {
	
	public void ejecutar() {
		receptor.derecha();
	}
	public void ejecutarOpuesto() {
		receptor.izquierda();
	}

}
