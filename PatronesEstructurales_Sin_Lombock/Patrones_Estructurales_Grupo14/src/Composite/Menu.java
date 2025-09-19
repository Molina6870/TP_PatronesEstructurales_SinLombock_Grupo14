package Composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements ElementoMenu {

    private String nombre;
    private List<ElementoMenu> elementos;

    // Constructor
    public Menu(String nombre) {
        this.nombre = nombre;
        this.elementos = new ArrayList<>();
    }

    // Método para agregar un elemento (Plato o Submenú)
    public void agregarElemento(ElementoMenu elemento) {
        elementos.add(elemento);
    }

    // Método para eliminar un elemento
    public void eliminarElemento(ElementoMenu elemento) {
        elementos.remove(elemento);
    }

    @Override
    public void mostrar() {
        System.out.println("\nMenú: " + nombre);
        System.out.println("-------------------------");
        for (ElementoMenu elemento : elementos) {
            elemento.mostrar();
        }
    }

    // Getter y Setter opcionales
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

