package controller;

import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.BloqueCompuesto;

import java.util.ArrayList;

public class CompuestosControl implements Controlador {
    private BloqueCompuesto bloque;
    private Controlador invControl;

    public CompuestosControl(BloqueCompuesto nuevoBloque, Controlador nuevoControlador){
        this.bloque = nuevoBloque;
        this.invControl = nuevoControlador;
    }

    public void agregarBloque(Bloque nuevo) {
        this.bloque.agregarBloque(nuevo);
    }

    public void ejecutar(){
        this.invControl.agregarBloque(bloque);
    }

    public ArrayList<Bloque> obtenerSecuencia(){
        return bloque.obtenerSecuencia();
    }

    @Override
    public void quitarBloque() {
        bloque.quitarBloque();
    }

    public void limpiar() {
        this.bloque.limpiarBloques();
    }
}
