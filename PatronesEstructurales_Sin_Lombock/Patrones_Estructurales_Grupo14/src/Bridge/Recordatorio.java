package Bridge;

public class Recordatorio extends Notificacion {

    public Recordatorio(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Generando recordatorio...");
        canal.enviarMensaje(mensaje);
    }

}

