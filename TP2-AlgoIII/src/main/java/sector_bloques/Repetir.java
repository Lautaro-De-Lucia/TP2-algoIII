package sector_bloques;

public class Repetir extends BloqueCompuesto {
		//FACTORY PARA ENCAPSULAR LA REPETICION 2 Y 3 Y USAR SOLO UNA CLASE "REPETIR"
		
		int veces = 1;
		
		public void setVeces(int num) { //MEJOR HACERLO UN PARÁMETRO EN EL CONSTRUCTOR
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
