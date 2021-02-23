package sector_bloques;

public class Repetir2 extends BloqueCompuesto {
	
//¿No podría cambiarse a una sola clase Repetir que tenga un atributo número de veces?
	
	public void ejecutar() {
	     super.ejecutar();
	     super.ejecutar();
	}
	
	public void revertirSecuencia() {
	     super.ejecutarOpuesto();
	     super.ejecutarOpuesto();
	}
	
}
