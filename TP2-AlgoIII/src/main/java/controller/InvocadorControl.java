package controller;

import sector_bloques.Bloque;
import sector_bloques.Invocador;

public class InvocadorControl{

    private Invocador invocador;

    public InvocadorControl(Invocador nuevoInvocador){
        this.invocador = nuevoInvocador;
    }

    public void agregarBloque(Bloque nuevo) {
        this.invocador.agregarBloque(nuevo);
    }

    public void ejecutar(){
        this.invocador.ejecutarSecuencia();
    }
}
