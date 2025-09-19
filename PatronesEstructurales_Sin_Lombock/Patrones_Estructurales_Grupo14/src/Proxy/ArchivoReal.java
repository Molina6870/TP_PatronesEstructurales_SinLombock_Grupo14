package Proxy;

// Esta clase simula el comportamiento real de abrir un archivo
public class ArchivoReal implements Archivo {

    private String nombre;

    public ArchivoReal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void abrir() {
        System.out.println("Se está abriendo el archivo ==> " + nombre);
    }
}

