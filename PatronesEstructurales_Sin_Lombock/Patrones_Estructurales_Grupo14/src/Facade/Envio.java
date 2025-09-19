package Facade;

public class Envio {

    private String idEnvio;

    public void envio(String idEnvio) {
        System.out.println("Se está realizando la entrega: " + idEnvio);
    }

    // Getter y Setter
    public String getIdEnvio() {
        return idEnvio;
    }

    public void setIdEnvio(String idEnvio) {
        this.idEnvio = idEnvio;
    }
}

