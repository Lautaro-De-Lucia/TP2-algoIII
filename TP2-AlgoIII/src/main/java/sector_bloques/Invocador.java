package sector_bloques;
import java.util.*;


public class Invocador {

	ArrayList<Bloque> colaDeBloques = new ArrayList<Bloque>();
	
	public void agregarBloque(Bloque bloque) {
		colaDeBloques.add(bloque);
	}
	
	public void ejecutarSecuencia() {
	     for (Bloque bloque : colaDeBloques) {bloque.ejecutar();}
	}
	
	public void revertirSecuencia() {
	     for (Bloque bloque : colaDeBloques) {bloque.ejecutarOpuesto();}
	}
	
}
