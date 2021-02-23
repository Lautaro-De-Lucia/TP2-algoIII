package sector_bloques;

public class Abajo extends Bloque {
	
	public void ejecutar() {
		receptor.abajo();
	}
	public void ejecutarOpuesto() {
		receptor.arriba();
	}
	
}
