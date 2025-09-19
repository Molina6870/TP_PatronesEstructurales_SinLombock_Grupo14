package Bridge;

public class Email implements CanalEnvio{

    @Override
    public void enviarMensaje(String mensaje){
        System.out.println("Enviando Mail =>" + mensaje);
    }

}
