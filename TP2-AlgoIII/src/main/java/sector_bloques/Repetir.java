package sector_bloques;

public class Repetir extends BloqueCompuesto {
		//FACTORY PARA ENCAPSULAR LA REPETICION 2 Y 3 Y USAR SOLO UNA CLASE "REPETIR"
		
		int repeticiones = 1;
		
		public Repetir(int repeticiones) {
			this.repeticiones = repeticiones;
		}
		
		public void setRepeticiones(int repeticiones) { 
			this.repeticiones = repeticiones;
		}
		
		public void ejecutar() {
			
			for (int i = 0; i < repeticiones; i++)
				super.ejecutar();
		    
		}
		
		public void revertirSecuencia() {
			for (int i = 0; i < repeticiones; i++)
				super.ejecutarOpuesto();
		}
		
	}
