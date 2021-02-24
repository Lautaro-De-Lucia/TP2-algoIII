package sector_dibujo;

public class LineaSolida extends Linea {
		
	Color color;
	
    public LineaSolida(Posicion punto1, Posicion punto2, Color nuevoColor){
        super(punto1, punto2);
        this.color = nuevoColor;
    }
    
    public void cambiarColor(Color nuevoColor) {
    	this.color = nuevoColor;
    }


}
