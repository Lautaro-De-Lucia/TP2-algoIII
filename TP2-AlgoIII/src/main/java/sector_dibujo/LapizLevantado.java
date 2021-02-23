package sector_dibujo;

public class LapizLevantado implements sector_dibujo.Lapiz {

    public LineaNula dibujarLinea(Posicion posicion1, Posicion posicion2){

        coordenadaInicial = new Posicion(posicion1);
        coordenadaFinal = new Posicion(posicion2);

        return (new LineaNula(coordenadainicial, coordenadaFinal));

    }

}
