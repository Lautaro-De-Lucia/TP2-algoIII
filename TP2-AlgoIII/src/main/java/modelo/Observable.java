package modelo;

public interface Observable {
    public void addObserver(Observador observador);

    public void avisarObservadores();
}
