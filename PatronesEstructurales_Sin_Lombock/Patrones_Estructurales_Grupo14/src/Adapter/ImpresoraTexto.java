package Adapter;

public class ImpresoraTexto {
// Esta clase, al ser incompatible con la interfaz, tiene su propio método distinto al de la interfaz

public void imprimirTextoPlano(String texto){
    System.out.println("Imprimiendo en Texto Plano =>" + texto);
}

}
