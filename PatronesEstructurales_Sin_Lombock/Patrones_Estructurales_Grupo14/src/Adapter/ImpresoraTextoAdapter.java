package Adapter;

public class ImpresoraTextoAdapter implements Impresora {

    private ImpresoraTexto impresoraTexto;

    // Constructor
    public ImpresoraTextoAdapter(ImpresoraTexto impresoraTexto) {
        this.impresoraTexto = impresoraTexto;
    }

    @Override
    public void imprimir(String documento) {
        // Adaptamos el método de ImpresoraTexto
        impresoraTexto.imprimirTextoPlano(documento);
    }
}

