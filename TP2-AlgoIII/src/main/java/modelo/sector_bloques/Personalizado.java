package modelo.sector_bloques;

public class Personalizado extends BloqueCompuesto {
    private static Personalizado personalizado = new Personalizado();
    public static Personalizado obtenerPersonalizado(){
        return personalizado;
    }
}
