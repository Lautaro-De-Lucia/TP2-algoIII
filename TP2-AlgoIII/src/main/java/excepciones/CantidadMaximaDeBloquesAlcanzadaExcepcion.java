package excepciones;

public class CantidadMaximaDeBloquesAlcanzadaExcepcion extends RuntimeException {
	
	public CantidadMaximaDeBloquesAlcanzadaExcepcion() {
		super();
	}
	
	public CantidadMaximaDeBloquesAlcanzadaExcepcion(String msg) {
		super(msg);
	 }
}

