package sector_bloques;

public class Repetir3 extends BloqueCompuesto {
			
		public void ejecutar() {
		     super.ejecutar();
		     super.ejecutar();
		     super.ejecutar();
		}
		
		public void revertirSecuencia() {
		     super.ejecutarOpuesto();
		     super.ejecutarOpuesto();
		     super.ejecutar();
		}
		
	}