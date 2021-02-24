package sector_dibujo;

public class Direccion {
	
	private int longitud;
	private int latitud;
	
	public Direccion() {
		this.longitud = 0;
        this.latitud = 0;
    }
	
	public Direccion(int newLong, int newLat) {
        this.longitud = newLong;
        this.latitud = newLat;
    }
	
	public int obtenerLongitud() {
		return this.longitud;
	}
	
	public int obtenerLatitud() {
		return this.latitud;
	}
	
	public void norte() {
        this.longitud = 0;
		this.latitud = 1;
	}
	
	public void sur() {
        this.longitud = 0;
		this.latitud = -1;
	}

	public void este() {
        this.longitud = 1;	
		this.latitud = 0;
	}

	public void oeste() {
        this.longitud = -1;
		this.latitud = 0;
	}
}
