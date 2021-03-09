package eventos;

import controller.Controlador;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;
import modelo.sector_bloques.*;

import java.util.HashMap;


public class HandlerColores implements EventHandler<ActionEvent>  {

    private Controlador controlador;
    private ComboBox comboBox;
    private HashMap<String,Bloque> bloquesMap = new HashMap<String,Bloque>();
    public HandlerColores(Controlador controlador, ComboBox comboBox){
        this.controlador = controlador;
        this.comboBox = comboBox;
        bloquesMap.put("Blanco",new Blanco());
        bloquesMap.put("Negro",new Negro());
        bloquesMap.put("Azul",new Azul());
        bloquesMap.put("Rojo",new Rojo());
        bloquesMap.put("Naranja",new Naranja());
        bloquesMap.put("Verde",new Verde());
        bloquesMap.put("Amarillo",new Amarillo());
        bloquesMap.put("Violeta",new Violeta());
        comboBox.getSelectionModel().selectFirst();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Bloque colorElegido = bloquesMap.get(comboBox.getValue());
        this.controlador.agregarBloque(colorElegido);
    }
}