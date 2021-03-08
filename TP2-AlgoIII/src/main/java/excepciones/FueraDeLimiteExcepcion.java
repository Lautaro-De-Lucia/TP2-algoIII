package excepciones;

public class FueraDeLimiteExcepcion extends RuntimeException {
	
	public FueraDeLimiteExcepcion() {
		super();
	}
	
	public FueraDeLimiteExcepcion(String msg) {
		super(msg);
	 }
}

