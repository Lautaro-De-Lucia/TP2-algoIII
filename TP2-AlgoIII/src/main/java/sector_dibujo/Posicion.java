package sector_dibujo;

public class Posicion {
	
	int coordX;
	int coordY;
	
	public Posicion() {
		coordX = 0;
		coordY = 0;
	}
	
	public Posicion (int X, int Y) {
		coordX = X;
		coordY = Y;
	}
	
	public void cambiar(Direccion direccion) {
		coordX = coordX + direccion.longitud();
		coordY = coordY + direccion.latitud();
	}

}
