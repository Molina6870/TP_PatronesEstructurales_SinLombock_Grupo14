package Bridge;

public class Alerta extends Notificacion {

    public Alerta(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Generando Alerta...");
        canal.enviarMensaje(mensaje);
    }

}
