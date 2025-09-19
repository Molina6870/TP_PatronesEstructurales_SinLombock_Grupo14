package Proxy;

public class Usuario {

    private String nombre;
    private boolean tienePermiso;

    public Usuario(String nombre, boolean tienePermiso) {
        this.nombre = nombre;
        this.tienePermiso = tienePermiso;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTienePermiso() {
        return tienePermiso;
    }

    public void setTienePermiso(boolean tienePermiso) {
        this.tienePermiso = tienePermiso;
    }
}

