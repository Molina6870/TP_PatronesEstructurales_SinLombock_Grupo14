package Facade;

public class Pago {

    private String metodoPago;
    private String idPago;

    public void efectuarPago(String idPago, String metodoPago) {
        System.out.println("Efectuando pago...");
        System.out.println("Número pago: " + idPago + " - Forma de Pago: " + metodoPago);
    }

    // Getters y Setters
    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getIdPago() {
        return idPago;
    }

    public void setIdPago(String idPago) {
        this.idPago = idPago;
    }
}

