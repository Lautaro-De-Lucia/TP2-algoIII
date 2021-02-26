package sector_dibujo;

public class LapizBajo extends Lapiz {

    public void dibujarLinea(Posicion posicion1, Posicion posicion2){

        Posicion coordenada1 = new Posicion(posicion1);
        Posicion coordenada2 = new Posicion(posicion2);

        SectorDibujo tablero = SectorDibujo.obtenerInstancia();
        tablero.agregarLinea(new LineaSolida(coordenada1, coordenada2, this.colorLapiz));
    }

}
