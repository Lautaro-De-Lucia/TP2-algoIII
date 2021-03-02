package modelo.sector_bloques;
import java.util.ArrayList;

public class BloqueCompuesto extends Bloque {
	
	ArrayList<Bloque> bloques = new ArrayList<Bloque>();
	
	public void agregarBloque(Bloque bloque) {
		bloques.add(bloque);
	}
	
	public void ejecutar() {
	     for (Bloque bloque : bloques) {bloque.ejecutar();}
	}
	
	public void revertirSecuencia() {
	     for (Bloque bloque : bloques) {bloque.ejecutarOpuesto();}
	}
	
	//Remueve el ultimo bloque que se agregó
	public void quitarBloque() {
		bloques.remove((bloques.size()-1));
	}
	
	//Remueve todos los bloques
	public void limpiarBloques() {
		bloques.clear();
		
	}
	

}
