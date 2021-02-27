package sector_dibujo;

public class LineaSolida extends Linea {
			
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
    	return this.color;
    }
    
    public void cambiarColor(Color nuevoColor) {
    	this.color = nuevoColor;
    }
    
    public boolean esNula() {
    	return false;
    }
    
}
