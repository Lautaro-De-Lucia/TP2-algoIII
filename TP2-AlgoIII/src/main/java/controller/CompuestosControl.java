package controller;

import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.BloqueCompuesto;

import java.util.ArrayList;

public class CompuestosControl implements Controlador {
    private BloqueCompuesto bloque;
    private InvocadorControl invControl;

    public CompuestosControl(BloqueCompuesto nuevoBloque, InvocadorControl nuevoControlador){
        this.bloque = nuevoBloque;
        this.invControl = nuevoControlador;
    }

    public void agregarBloque(Bloque nuevo) {
        this.bloque.agregarBloque(nuevo);
    }

    public void ejecutar(){
        System.out.println(bloque.obtenerSecuencia());
        this.invControl.agregarBloque(bloque);
    }

    public ArrayList<Bloque> obtenerSecuencia(){
        return bloque.obtenerSecuencia();
    }

    public void limpiar() {
        this.bloque.limpiarBloques();
    }
}
