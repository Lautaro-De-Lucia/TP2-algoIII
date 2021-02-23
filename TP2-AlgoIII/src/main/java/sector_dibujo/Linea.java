package sector_dibujo;

public class Linea {
    Posicion origen;
    Posicion destino;
    Color color;


    public Linea(Posicion nuevoOrigen, Posicion nuevoDestino){
        this.origen = nuevoOrigen;
        this.destino = nuevoDestino;
    }
    
    public Linea(Posicion nuevoOrigen, Posicion nuevoDestino, Color nuevoColor){
        this.origen = nuevoOrigen;
        this.destino = nuevoDestino;
        this.color = nuevoColor;
    }

    public void setDestino(Posicion destino) {
        this.destino = destino;
    }

    public Posicion getOrigen() {
        return origen;
    }

    public Posicion getDestino() {
        return destino;
    }

    public void setOrigen(Posicion origen) {
        this.origen = origen;
    }

    public boolean igualA(Linea otraLinea){
        if(origen == otraLinea.getOrigen()){
            if(destino == otraLinea.getDestino()){
                return true;
            }
        }
        return false;
    }
}
