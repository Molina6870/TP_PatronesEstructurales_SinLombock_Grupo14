package FlyWeight;

// Esta clase representa la información compartida por muchos árboles,
// como el tipo, color y textura.
// Importante: Esta clase NO guarda la posición del árbol.
public class ArbolTipo {

    private String nombre;
    private String color;
    private String textura;

    public ArbolTipo(String nombre, String color, String textura) {
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }

    public void dibujar(int x, int y) {
        System.out.println(
                "Dibujando un " + nombre +
                        " en (" + x + ";" + y + ") " +
                        "con color = " + color +
                        " y textura = " + textura
        );
    }
}

