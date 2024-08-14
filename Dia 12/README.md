# Patrones Estructurales 

Los patrones estructurales en Java se centran en cómo componer clases y objetos para formar estructuras más grandes. Estos patrones ayudan a garantizar que las relaciones entre las entidades sean simples y flexibles. Aquí hay algunos de los patrones estructurales más comunes:

 **Patrón Adapter (Adaptador):**

* Convierte la interfaz de una clase en otra interfaz que el cliente espera. Permite que clases con interfaces incompatibles trabajen juntas.

* Ejemplo: Usar un adaptador para permitir que un sistema antiguo trabaje con una nueva API.

**Patrón Bridge (Puente):**

* Desvincula una abstracción de su implementación para que ambas puedan variar de forma independiente.

* Ejemplo: Separar la abstracción de un control remoto de la implementación específica del dispositivo que controla (TV, DVD, etc.).

**Patrón Composite (Composición):**

* Compone objetos en estructuras de árbol para representar jerarquías parte-todo. Permite tratar a los objetos individuales y a las composiciones de objetos de manera uniforme.

* Ejemplo: Una estructura de menú donde cada elemento del menú puede ser un elemento simple o un submenú con más elementos.

**Patrón Decorator (Decorador):**

* Añade funcionalidad adicional a un objeto de manera dinámica. Este patrón proporciona una alternativa flexible a la subclasificación para extender la funcionalidad.

* Ejemplo: Añadir diferentes estilos a un componente gráfico sin cambiar su estructura base.

**Patrón Facade (Fachada):**

* Proporciona una interfaz simplificada a un conjunto de interfaces en un subsistema. Facade define una interfaz de nivel más alto que hace que el subsistema sea más fácil de usar.

* Ejemplo: Un sistema de gestión de pedidos que proporciona una interfaz simple para acceder a las funciones de inventario, facturación y envío.

**Patrón Flyweight (Peso Ligero):**

* Minimiza el uso de memoria compartiendo la mayor cantidad posible de datos entre objetos similares. Es útil cuando un gran número de objetos debe ser creado.

* Ejemplo: Usar un flyweight para gestionar caracteres en un editor de texto, donde cada carácter es un objeto compartido en lugar de crear un objeto por cada letra.

**Patrón Proxy (Proxy):**

* Proporciona un sustituto o marcador de posición para otro objeto para controlar el acceso a este.

* Ejemplo: Usar un proxy para controlar el acceso a un recurso remoto o para cargar de forma diferida un objeto costoso. 