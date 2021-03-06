package controller;

import modelo.sector_bloques.Bloque;
import modelo.sector_bloques.Invocador;

import java.util.ArrayList;

public class InvocadorControl implements Controlador{

    private Invocador invocador;

    public InvocadorControl(Invocador nuevoInvocador){
        this.invocador = nuevoInvocador;
    }

    public void agregarBloque(Bloque nuevo) {
        this.invocador.agregarBloque(nuevo);
        System.out.println(invocador.obtenerSecuencia());
    }

    public ArrayList<Bloque> obtenerSecuencia(){
        return invocador.obtenerSecuencia();
    }

    @Override
    public void quitarBloque() {
        invocador.quitarBloque();
    }

    public void ejecutar(){
        this.invocador.ejecutarSecuencia();
    }

    public void limpiar() {
        this.invocador.limpiarSecuencia();
    }
}