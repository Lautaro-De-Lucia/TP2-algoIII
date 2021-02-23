package sector_bloques;

public class Arriba extends Bloque {
	
	public void ejecutar() {
		receptor.arriba();
	}
	public void ejecutarOpuesto() {
		receptor.abajo();
	}

}
