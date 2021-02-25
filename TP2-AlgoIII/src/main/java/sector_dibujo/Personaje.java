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
	
	public Posicion obtenerPosicion() {
		
		return this.posicion;
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
	
	public void mover(Direccion direccionNueva) {
		
		Posicion posicionOriginal = new Posicion(this.posicion);
		Posicion nuevaPosicion = new Posicion(posicionOriginal, direccionNueva);
		
		int limite = SectorDibujo.dimension;
		
		if( (nuevaPosicion.obtenerCoordX() > limite) || (nuevaPosicion.obtenerCoordY() > limite) )
			return;
		
        this.posicion = nuevaPosicion;
        this.orientacion = direccionNueva;
        
        this.lapiz.dibujarLinea(posicionOriginal, nuevaPosicion);
        
        return;
	}
		
}
