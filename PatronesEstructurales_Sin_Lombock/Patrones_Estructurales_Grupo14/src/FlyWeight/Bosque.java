package FlyWeight;

import java.util.ArrayList;
import java.util.List;

// Maneja todos los árboles del juego.
// Los tipos de árbol no se duplican, solo las posiciones.
public class Bosque {

    private List<Arbol> arboles = new ArrayList<>();

    public void plantarArbol(int x, int y, String nombre, String color, String textura) {
        ArbolTipo tipo = FabricaDeArboles.getArbolTipo(nombre, color, textura);
        Arbol arbol = new Arbol(x, y, tipo);
        arboles.add(arbol);
    }

    public void dibujar() {
        for (Arbol arbol : arboles) {
            arbol.dibujar();
        }
    }
}

