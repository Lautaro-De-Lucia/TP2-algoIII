package sector_dibujo;

public class LineaNula extends Linea{
	
    public LineaNula(Posicion punto1, Posicion punto2) {
        super(punto1, punto2);
    }
    
    public boolean esNula() {
    	return true;
    }
    
	public boolean igualA(LineaSolida otraLinea){
		
		return false;
		
	}

}
