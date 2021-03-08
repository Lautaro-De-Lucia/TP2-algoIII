package modelo.sector_dibujo;

class FueraDeLimiteExcepcion extends Exception {
	public FueraDeLimiteExcepcion() {
		System.out.println("Se ha llegado a un extremo del tablero");
	}
}