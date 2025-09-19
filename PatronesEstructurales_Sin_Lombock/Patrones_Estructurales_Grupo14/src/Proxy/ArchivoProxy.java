package Proxy;

public class ArchivoProxy implements Archivo {

    private ArchivoReal archivoReal;
    private Usuario usuario;
    private String nombreArchivo;

    public ArchivoProxy(String nombreArchivo, Usuario usuario) {
        this.nombreArchivo = nombreArchivo;
        this.archivoReal = new ArchivoReal(nombreArchivo);
        this.usuario = usuario;
    }

    @Override
    public void abrir() {
        if (usuario.isTienePermiso()) {
            System.out.println("El acceso ha sido autorizado para el siguiente usuario ==> " + usuario.getNombre());
            archivoReal.abrir(); // Como el acceso ha sido permitido, delegamos al objeto real
        } else {
            System.out.println("El acceso ha sido denegado para el siguiente usuario ==> " + usuario.getNombre());
        }
    }

    // Getters y Setters
    public ArchivoReal getArchivoReal() {
        return archivoReal;
    }

    public void setArchivoReal(ArchivoReal archivoReal) {
        this.archivoReal = archivoReal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }



}

