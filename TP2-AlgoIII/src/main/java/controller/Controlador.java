package controller;

import modelo.sector_bloques.Bloque;

import java.util.ArrayList;

public interface Controlador {

    public void agregarBloque(Bloque nuevo);

    public void ejecutar();

    public void limpiar();

    public ArrayList<Bloque> obtenerSecuencia();
}
