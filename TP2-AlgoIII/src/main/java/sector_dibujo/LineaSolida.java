package sector_dibujo;

public class LineaSolida extends Linea {
		
	Color color;
	
    public LineaSolida(Posicion punto1, Posicion punto2, Color nuevoColor){
        super(punto1, punto2);
        this.color = nuevoColor;
    }
    
    public LineaSolida(LineaSolida otraLinea){
    	
    	super(otraLinea);
    	this.color = otraLinea.getColor();
    }
    
    public LineaSolida(Posicion punto1, Posicion punto2){
        super(punto1, punto2);
        this.color = Color.NEGRO;
    }
    
    public Color getColor() {
    	return color;
    }
    
    public void cambiarColor(Color nuevoColor) {
    	this.color = nuevoColor;
    }
    
    public boolean esNula() {
    	return false;
    }
    
	public boolean igualA(LineaSolida otraLinea){
		
	    if(this.color == otraLinea.getColor()) {
	    	
	    	if((this.punto1).igualA(otraLinea.getPunto1()) && (this.punto2).igualA(otraLinea.getPunto2())){
	        	return true;
	        }
	        	
	        if((this.punto2).igualA(otraLinea.getPunto1()) && (this.punto1).igualA(otraLinea.getPunto2())){
	        	return true;
	        }
		}
	    
	    return false;
	
	}
	
	public boolean igualA(LineaNula otraLinea){
		
		return false;
		
	}
	
}
