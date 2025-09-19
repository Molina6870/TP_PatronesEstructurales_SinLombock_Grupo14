package FlyWeight;

import java.util.HashMap;
import java.util.Map;

// Esta clase reutiliza los objetos ArbolTipo para evitar crear repetidos.
// Usa un Map para guardar los tipos de árbol ya creados.
public class FabricaDeArboles {

    private static final Map<String, ArbolTipo> tipos = new HashMap<>();

    public static ArbolTipo getArbolTipo(String nombre, String color, String textura) {
        ArbolTipo tipo = tipos.get(nombre);

        if (tipo == null) {
            tipo = new ArbolTipo(nombre, color, textura);
            tipos.put(nombre, tipo);
            System.out.println("Creando un nuevo tipo de árbol: " + nombre);
        }
        return tipo;
    }
}

