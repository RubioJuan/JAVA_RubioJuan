# Patrones de Comportamiento 

Los patrones de comportamiento son un tipo de patrones de diseño que se enfocan en la comunicación entre objetos. Estos patrones ayudan a definir cómo los objetos interactúan y se comunican entre sí para lograr un objetivo particular. Algunos de los patrones de comportamiento más comunes en Java son:

**Chain of Responsibility (Cadena de Responsabilidad)** 

* Propósito: Evitar el acoplamiento entre el emisor de una petición y su receptor, dando la oportunidad a varios objetos de manejar la petición.

* Ejemplo: Un sistema de soporte donde las solicitudes de ayuda se pasan a través de diferentes niveles de soporte (por ejemplo, soporte básico, soporte técnico, soporte avanzado).

**Command (Comando)**

* Propósito: Encapsular una solicitud como un objeto, lo que permite parametrizar a los clientes con diferentes solicitudes, encolar o registrar solicitudes y soportar operaciones que se pueden deshacer.

* Ejemplo: Implementar un menú en una aplicación donde cada opción del menú se mapea a un comando que se puede ejecutar de manera independiente.

**Iterator (Iterador)**

* Propósito: Proporcionar una forma de acceder secuencialmente a los elementos de un objeto agregado sin exponer su representación subyacente.

* Ejemplo: Recorrer una lista de elementos en una colección, como un ArrayList o un HashSet, utilizando un iterador.

**Mediator (Mediador)**

* Propósito: Definir un objeto que encapsule cómo un conjunto de objetos interactúan. El mediador promueve el acoplamiento débil manteniendo a los objetos de forma independiente.

* Ejemplo: Un sistema de chat donde el mediador centraliza y administra la comunicación entre diferentes usuarios.

**Memento**

* Propósito: Capturar y externalizar el estado interno de un objeto para que el objeto pueda ser restaurado a este estado más tarde sin violar el encapsulamiento.

* Ejemplo: Implementar una función de "deshacer" en un editor de texto.

**Observer (Observador)**

* Propósito: Definir una dependencia de uno a muchos entre objetos de manera que cuando un objeto cambie de estado, todos sus dependientes sean notificados y actualizados automáticamente.

* Ejemplo: Un sistema de notificaciones donde los observadores reciben actualizaciones cuando se producen cambios en el sujeto observado.

**State (Estado)**

* Propósito: Permitir que un objeto altere su comportamiento cuando su estado interno cambia. El objeto parecerá cambiar de clase.

* Ejemplo: Una máquina de estados que cambia su comportamiento basado en el estado actual, como una máquina expendedora que tiene diferentes estados como "esperando moneda", "selección de producto", y "entregando producto".

**Strategy (Estrategia)**

* Propósito: Definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. El patrón de estrategia permite que el algoritmo varíe independientemente de los clientes que lo utilicen.

* Ejemplo: Un sistema de pago en línea donde puedes elegir entre diferentes métodos de pago como tarjeta de crédito, PayPal, o transferencia bancaria.

**Template Method (Método Plantilla)**

* Propósito: Definir el esqueleto de un algoritmo en una operación, dejando que algunas etapas se implementen en las subclases.

* Ejemplo: Un sistema de generación de informes donde la estructura básica del informe es la misma, pero los detalles específicos pueden variar.

**Visitor (Visitante)**

* Propósito: Representar una operación que se realiza sobre los elementos de una estructura de objetos. El patrón de visitante permite definir una nueva operación sin cambiar las clases de los elementos sobre los que opera.

* Ejemplo: Un compilador que aplica diferentes operaciones (como análisis, optimización, y generación de código) sobre un árbol de sintaxis abstracta.