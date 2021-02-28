package modelo.sector_dibujo;

public abstract class Lapiz {

	Color colorLapiz = Color.NEGRO;
	
	public void cambiarColor(Color nuevoColor) {
		colorLapiz = nuevoColor;
	}
	
	public Color obtenerColor() {
		return colorLapiz;
	}
	
    public abstract void dibujarLinea(Posicion posicion1, Posicion posicion2);
    

}
