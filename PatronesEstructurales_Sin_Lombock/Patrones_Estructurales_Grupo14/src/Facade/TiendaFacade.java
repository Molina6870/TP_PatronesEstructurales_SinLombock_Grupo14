package Facade;

public class TiendaFacade {

    // Componentes internos que simplifican la compra
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    // Constructor
    public TiendaFacade(Carrito carrito, Pago pago, Envio envio) {
        this.carrito = carrito;
        this.pago = pago;
        this.envio = envio;
    }

    // Método que centraliza toda la operación de compra
    public void compra(String idEnvio, String idPago, String metodoPago, String productos) {
        System.out.println(":::: Se realizó la siguiente compra ::::");

        carrito.agregarCarrito(productos);
        pago.efectuarPago(idPago, metodoPago);
        envio.envio(idEnvio);

        System.out.println("---------------------------------------\n");
    }

    // Getters y Setters
    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Envio getEnvio() {
        return envio;
    }

    public void setEnvio(Envio envio) {
        this.envio = envio;
    }
}

