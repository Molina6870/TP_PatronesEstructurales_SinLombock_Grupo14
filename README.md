# TP_PatronesEstructurales_SinLombock_Grupo14

*Integrantes del Grupo 14:* 
  - Molina Juan Ignacio
  - Montenegro Lautaro
  - Fernández Mauro
  - Lopez Mariano 
  - Alvarez Joaquin
  - Urcullu Marcos

# Patrones implementados

### 1. **Adapter**
**Descripción:**  
Permite que dos clases con interfaces incompatibles trabajen juntas.  
Se utiliza un **adaptador** que actúa como intermediario para traducir las llamadas.

**Cómo funciona en este proyecto:**  
- `Impresora` → Interfaz estándar que define el método `imprimir()`.  
- `ImpresoraTexto` → Clase incompatible con su propio método `imprimirTextoPlano()`.  
- `ImpresoraTextoAdapter` → Adaptador que convierte `imprimir()` en `imprimirTextoPlano()`.  
- `ImpresoraTextoPDF` → Clase compatible que implementa `Impresora` directamente.

### 2. **Bridge**
**Descripción:**  
Separa una abstracción de su implementación para que puedan evolucionar de forma independiente.  
Esto evita la creación de múltiples combinaciones de clases.

**Cómo funciona en este proyecto:**  
- `canalEnvio` → Interfaz para métodos de envío (`SMS` y `Email`).  
- `Notificacion` → Clase abstracta que representa distintos tipos de notificaciones.  
- Subclases: `Alerta`, `Promocion`, `Recordatorio`.  
- Implementaciones concretas de `canalEnvio`: `Sms` y `Email`.

### 3. **Composite**
**Descripción:**  
Permite tratar objetos individuales y compuestos de forma uniforme, formando una **estructura jerárquica en árbol**.

**Cómo funciona en este proyecto:**  
- `ElementoMenu` → Interfaz común para platos y menús.  
- `Plato` → Representa un elemento individual del menú.  
- `Menu` → Puede contener `Plato` o incluso otros `Menu`.  
- Métodos como `mostrar()` funcionan tanto en elementos individuales como en compuestos.


### 4. **Decorator**
**Descripción:**  
Permite agregar responsabilidades o funcionalidades adicionales a un objeto **dinámicamente**, sin modificar su clase base.

**Cómo funciona en este proyecto:**  
- `Plan` → Interfaz base con métodos `getDescripcion()` y `calcularCosto()`.  
- `PlanBasico` → Implementación base del plan.  
- `PlanDecorator` → Clase abstracta que envuelve un `Plan`.  
- Decoradores concretos: `HD`, `UltraHD`, `DescargasOffline`.


### 5. **Facade**
**Descripción:**  
Proporciona una **interfaz simplificada** para acceder a un sistema complejo de clases, ocultando la complejidad interna.

**Cómo funciona en este proyecto:**  
- Subsistemas: `Carrito`, `Pago`, `Envio`.  
- `TiendaFacade` → Clase que centraliza y simplifica las operaciones de compra.  
- El `main` solo necesita interactuar con `TiendaFacade` en lugar de cada subsistema.


### 6. **Flyweight**
**Descripción:**  
Minimiza el uso de memoria compartiendo la mayor cantidad posible de datos entre objetos similares.

**Cómo funciona en este proyecto:**  
- `Arbol` → Objeto que contiene posición única (`x`, `y`) y referencia a un tipo compartido.  
- `ArbolTipo` → Datos compartidos como nombre, color y textura.  
- `FabricaDeArboles` → Se asegura de que solo existan los tipos necesarios, evitando duplicados.  
- `Bosque` → Maneja la plantación y dibujo de millones de árboles.


### 7. **Proxy**
**Descripción:**  
Proporciona un **sustituto o representante** para controlar el acceso a otro objeto.

**Cómo funciona en este proyecto:**  
- `Archivo` → Interfaz común para acceso a archivos.  
- `ArchivoReal` → Representa el archivo real que se quiere abrir.  
- `ArchivoProxy` → Controla el acceso según los permisos de un `Usuario`.  
- `Usuario` → Contiene información sobre permisos.
