package modelo.sector_bloques;

public class Invertir extends BloqueCompuesto{

	public void ejecutar() {
		for (int i = bloques.size() - 1; i >= 0; i--) {
		    bloques.get(i).ejecutar();
		}
	}
	
	public void ejecutarOpuesto() {
		for (int i = bloques.size() - 1; i >= 0; i--) {
		    bloques.get(i).ejecutarOpuesto();
		}	
	}
	
}
