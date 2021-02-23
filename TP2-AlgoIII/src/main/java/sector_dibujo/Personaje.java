package sector_dibujo;

public class Personaje {
	
	private Direccion orientacion;
	private Posicion posicion;
	private Lapiz lapiz;
		
	public Personaje() {
		this.orientacion = new Direccion();
		this.orientacion.sur();
		this.posicion = new Posicion(0, 0);
		this.lapiz = new LapizBajo();
	}
	
	public Personaje(Direccion orientacion, Posicion posicion, Lapiz lapiz) {
		this.orientacion = orientacion;
		this.posicion = posicion;
		this.lapiz = lapiz;
	}
	
	public void levantarLapiz() {
	 
		this.lapiz = new LapizLevantado();
	}
	
	public void bajarLapiz() {
		 
		this.lapiz = new LapizBajo();
	}
	
	public void ponerLapizEnBorrador() {
		 
		this.lapiz = new LapizEnBorrador();
	}
	
	public void nuevoColorDeLapiz(Color colorNuevo) {
		 
		this.lapiz.cambiarColor(colorNuevo);
	}
	
	public Linea mover(Direccion direccionNueva) {
		
		Posicion posicionOriginal = new Posicion(this.posicion);
		Posicion nuevaPosicion = new Posicion(this.posicion, direccionNueva);
		
		
        this.posicion = nuevaPosicion;
        this.orientacion = direccionNueva;
        
        Linea nuevaLinea = this.lapiz.dibujarLinea(posicionOriginal, nuevaPosicion);
        
        return nuevaLinea; 
	}
		
}
