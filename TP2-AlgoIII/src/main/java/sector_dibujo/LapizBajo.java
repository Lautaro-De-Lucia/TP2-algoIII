package sector_dibujo;

public class LapizBajo implements sector_dibujo.Lapiz {

    public Linea dibujarLinea(Posicion posicion1, Posicion posicion2){

        coordenadaInicial = new Posicion(posicion1);
        coordenadaFinal = new Posicion(posicion2);

        return (new Linea(coordenadaInicial, coordenadaFinal));

    }

}
