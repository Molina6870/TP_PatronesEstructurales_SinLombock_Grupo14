package Composite;

public class Plato implements ElementoMenu {

    private String nombre;
    private double precio;

    // Constructor
    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters (opcional)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void mostrar() {
        System.out.println("Plato: " + nombre + " - Precio: $" + precio);
    }
}

