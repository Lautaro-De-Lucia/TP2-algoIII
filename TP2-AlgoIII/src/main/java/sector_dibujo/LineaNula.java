package sector_dibujo;

public class LineaNula extends Linea{
	
    public LineaNula(Posicion punto1, Posicion punto2) {
        super(punto1, punto2);
        this.color = Color.NULO;
    }
    
    public Color getColor() {
    	return Color.NULO;
    }
        

}
