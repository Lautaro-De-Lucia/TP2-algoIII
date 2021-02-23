package sector_bloques;

public class Repetir extends BloqueCompuesto {
	
		int veces = 1;
		
		public void setVeces(int num) {
			veces = num;
		}
		
		public void ejecutar() {
			
			for (int i = 0; i < veces; i++)
				super.ejecutar();
		    
		}
		
		public void revertirSecuencia() {
			for (int i = 0; i < veces; i++)
				super.ejecutarOpuesto();
		}
		
	}
