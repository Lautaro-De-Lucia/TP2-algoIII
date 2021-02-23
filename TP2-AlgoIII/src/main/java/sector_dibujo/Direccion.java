package sector_dibujo;

public class Direccion {
	
	private int latitud;
	private int longitud;
	
	public Direccion() {
        this.latitud = 0;
        this.longitud = 0;
    }
	
	public Direccion(int newLat, int newLong) {
        this.latitud = newLat;
        this.longitud = newLong;
    }
	
	public int obtenerLatitud() {
		return this.latitud;
	}
	
	public int obtenerLongitud() {
		return this.longitud;
	}
	
	public void norte() {
		this.latitud = 0;
        this.longitud = 1;
	}
	
	public void sur() {
		this.latitud = 0;
        this.longitud = -1;
	}

	public void este() {
		this.latitud = 1;
        this.longitud = 0;	
	}

	public void oeste() {
		this.latitud = -1;
        this.longitud = 0;	
	}
}
