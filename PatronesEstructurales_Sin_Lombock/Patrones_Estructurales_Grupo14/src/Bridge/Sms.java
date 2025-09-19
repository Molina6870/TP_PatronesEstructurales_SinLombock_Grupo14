package Bridge;

public class Sms implements CanalEnvio{

    @Override
    public void enviarMensaje(String mensaje){
        System.out.println("Enviando SMS =>" + mensaje);
    }
}
