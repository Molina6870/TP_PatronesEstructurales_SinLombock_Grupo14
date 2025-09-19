package Adapter;

public class ImpresoraTextoPDF implements Impresora {
    @Override
    public void imprimir(String documento){
        System.out.println("Imprimiendo documento en PDF =>" + documento);
    }

}
