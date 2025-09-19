import Adapter.*;
import Bridge.*;
import Composite.*;
import Decorator.*;
import Facade.*;
import FlyWeight.*;
import Proxy.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    // Ejercicio 1 => Adapter
            System.out.println("************ADAPTER************");

            ImpresoraTextoPDF PDF1 = new ImpresoraTextoPDF(); // Clase existente
            PDF1.imprimir("Documento.pdf");

            ImpresoraTexto TEXTO1 = new ImpresoraTexto(); // Clase incompatible

        // Usamos el Adapter
            Impresora textoAdaptado = new ImpresoraTextoAdapter(TEXTO1);
            textoAdaptado.imprimir("Documento.txt");


    // Ejercicio 2 => Bridge
            System.out.println("************BRIDGE************");

        // Creamos los canales
            CanalEnvio email = new Email();
            CanalEnvio sms = new Sms();

        // Creamos las notificaciones con distintos canales
            Notificacion alertaEmail = new Alerta(email);
            Notificacion notificacionSMS = new Recordatorio(sms);
            Notificacion promocionEmail = new Promocion(email);
        // Enviamos los mensajes
            alertaEmail.enviar("Servidor caído. Estamos en mantenimiento");
            System.out.println("*                  *                     *                  *");

            notificacionSMS.enviar("Dentro de unos días vence la factura del agua");
            System.out.println("*                  *                     *                  *");

            promocionEmail.enviar("Aprovecha la siguiente oferta: 20% de descuento en productos seleccionados");

    // Ejercicio 3 => Decorator
        System.out.println("************DECORATOR************");

        // Caso 1: Solo Plan Básico
                Plan plan1 = new PlanBasico();
                System.out.println(plan1.getDescripcion() + " = $" + plan1.calcularCosto());

        // Caso 2: Plan Básico + HD
                Plan plan2 = new HD(new PlanBasico());
                System.out.println(plan2.getDescripcion() + " = $" + plan2.calcularCosto());

        // Caso 3: Plan Básico + HD + Descargas Offline
                Plan plan3 = new DescargasOffline(new HD(new PlanBasico()));
                System.out.println(plan3.getDescripcion() + " = $" + plan3.calcularCosto());

        // Caso 4: Plan Básico + Ultra HD
                Plan plan4 = new UltraHD(new PlanBasico());
                System.out.println(plan4.getDescripcion() + " = $" + plan4.calcularCosto());

        // Caso 5: Plan Básico + Ultra HD + Descargas Offline
                Plan plan5 = new DescargasOffline(new UltraHD(new PlanBasico()));
                System.out.println(plan5.getDescripcion() + " = $" + plan5.calcularCosto());


    // Ejercicio 4 => Facade
        System.out.println("************FACADE************");
            Carrito carrito = new Carrito();
            Pago pago = new Pago();
            Envio envio = new Envio();

            TiendaFacade facade = new TiendaFacade(carrito, pago, envio);

            facade.compra("1234", "6870", "Efectivo", "Yerba mate");
            facade.compra("410", "45912", "Mercado Pago", "Mermelada");

        System.out.println("************FLYWEIGHT************");
    // Ejercicio 5 => FlyWeight
            final int CANTIDAD_ARBOLES = 1_000_000;
            final int TIPOS_ARBOLES = 2;
            final int MAX = 1000;

            Bosque bosque = new Bosque();
            Random random = new Random();

            System.out.println("Plantando " + CANTIDAD_ARBOLES + " árboles...");

            for (int i = 0; i < CANTIDAD_ARBOLES; i++) {
                int x = random.nextInt(MAX);
                int y = random.nextInt(MAX);

                if (i % 2 == 0) {
                    bosque.plantarArbol(x, y, "Pino", "Verde", "Textura rugosa");
                } else {
                    bosque.plantarArbol(x, y, "Roble", "Marrón", "Textura lisa");
                }
            }

            System.out.println("Finalizada la plantación.");
            System.out.println("Se crearon " + TIPOS_ARBOLES + " tipos de árbol para representar 1 millón de instancias.");


    // Ejercicio 6 => Proxy
        System.out.println("************PROXY************");

            Usuario usuario1 = new Usuario("Mateo", true);  // Tiene permiso
            Usuario usuario2 = new Usuario("Elisa", false); // Sin permiso

            Archivo archivo1 = new ArchivoProxy("documento_confidencial.pdf", usuario1);
            Archivo archivo2 = new ArchivoProxy("documento_confidencial.pdf", usuario2);

            System.out.println("Intentando abrir archivo con Mateo:");
            archivo1.abrir();

            System.out.println("\nIntentando abrir archivo con Elisa:");
            archivo2.abrir();


        System.out.println("************COMPOSITE************");
    // Ejercicio 7 => Composite
        // Platos individuales
                Plato plato1 = new Plato("Milanesa con papas", 3500);
                Plato plato2 = new Plato("Ensalada César", 2500);
                Plato plato3 = new Plato("Sopa de verduras", 1800);
                Plato plato4 = new Plato("Flan con dulce de leche", 1200);

        // Menú principal
                Menu menuPrincipal = new Menu("Menú Principal");
                menuPrincipal.agregarElemento(plato1);
                menuPrincipal.agregarElemento(plato2);

        // Submenú de postres
                Menu menuPostres = new Menu("Postres");
                menuPostres.agregarElemento(plato4);

        // Submenú de entradas
                Menu menuEntradas = new Menu("Entradas");
                menuEntradas.agregarElemento(plato3);

        // El menú principal puede contener submenús
                menuPrincipal.agregarElemento(menuEntradas);
                menuPrincipal.agregarElemento(menuPostres);

        // Mostrar todo el menú
                menuPrincipal.mostrar();


    }
}