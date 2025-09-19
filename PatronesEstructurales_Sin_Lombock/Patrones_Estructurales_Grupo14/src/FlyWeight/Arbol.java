package FlyWeight;

// Esta clase representa un árbol individual en el mapa
// Cada árbol tiene su propia posición (x, y), pero comparte la información del tipo.
public class Arbol {

    private int x;
    private int y;
    private ArbolTipo tipo; // Referencia compartida

    public Arbol(int x, int y, ArbolTipo tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public void dibujar() {
        tipo.dibujar(x, y);
    }
}

