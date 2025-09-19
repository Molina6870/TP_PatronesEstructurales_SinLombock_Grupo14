package Facade;

public class Carrito {

    private String productos;

    public void agregarCarrito(String productos) {
        System.out.println("Seleccione los productos para agregar al carrito = " + productos);
    }

    // Getter y Setter
    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
}

