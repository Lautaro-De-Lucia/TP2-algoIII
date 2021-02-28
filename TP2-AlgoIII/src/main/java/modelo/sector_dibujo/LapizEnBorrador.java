package modelo.sector_dibujo;

public class LapizEnBorrador extends Lapiz {

    public void dibujarLinea(Posicion posicion1, Posicion posicion2){

        Posicion coordenada1 = new Posicion(posicion1);
        Posicion coordenada2 = new Posicion(posicion2);

        SectorDibujo tablero = SectorDibujo.obtenerInstancia();
        tablero.agregarLinea(new LineaNula(coordenada1, coordenada2));

    }
	
}
