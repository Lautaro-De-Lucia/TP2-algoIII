package sector_dibujo;

public class LapizBajo extends Lapiz {

    public Linea dibujarLinea(Posicion posicion1, Posicion posicion2){

        Posicion coordenadaInicial = new Posicion(posicion1);
        Posicion coordenadaFinal = new Posicion(posicion2);

        return (new Linea(coordenadaInicial, coordenadaFinal));

    }

}
