package sector_dibujo;

public class Posicion {
	
	private int coordX;
	private int coordY;
	
	public Posicion() {
		this.coordX = 0;
		this.coordY = 0;
	}
	
	public Posicion(int X, int Y) {
		this.coordX = X;
		this.coordY = Y;
	}
	
	public Posicion(Posicion posicionACopiar) {
		this.coordX = posicionACopiar.obtenerCoordX();
		this.coordY = posicionACopiar.obtenerCoordY();
	}
	
	public Posicion(Posicion posicionAnterior, Direccion direccionNueva) {
		
		Posicion posicionNueva = new Posicion(posicionAnterior.obtenerCoordX(), posicionAnterior.obtenerCoordY());
		
		posicionNueva.cambiar(direccionNueva);
		
		this.coordX = posicionNueva.obtenerCoordX();
		this.coordX = posicionNueva.obtenerCoordY();	
	}
		
	public int obtenerCoordX() {
		return this.coordX;
	}
	
	public int obtenerCoordY() {
		return this.coordY;
	}
		
	public void cambiar(Direccion direccionNueva) {
		this.coordX = this.coordX + direccionNueva.obtenerLongitud();
		this.coordY = this.coordY + direccionNueva.obtenerLatitud();
	}
	
	public boolean igualA(Posicion otraPosicion) {
		if((this.coordX == otraPosicion.obtenerCoordX()) && (this.coordY == otraPosicion.obtenerCoordY()))
			return true;
		return false;
	}

}



