package modelo.sector_dibujo;

public class LapizBajo extends Lapiz {

    public void trazar(Posicion coordenada1, Posicion coordenada2){

        SectorDibujo tablero = SectorDibujo.obtenerInstancia();
        tablero.agregarLinea(new LineaSolida(coordenada1, coordenada2, this.colorLapiz));
    }

}
