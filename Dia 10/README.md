#  Patrones Creacionales 

Los patrones creacionales en Java son un conjunto de soluciones de diseño de software que se centran en la creación de objetos de una manera específica para resolver problemas comunes relacionados con la creación de instancias. Estos patrones ayudan a controlar cómo se crean los objetos, asegurando que el proceso sea flexible, eficiente y manejable. Son fundamentales para mantener un código limpio y escalable.

**Singleton:**

- Garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a esa instancia.

- Útil cuando solo se necesita una única instancia de una clase a lo largo de la aplicación (como en el caso de un logger, conexión a base de datos, etc.).

**Factory Method:**

- Define una interfaz para crear un objeto, pero permite a las subclases alterar el tipo de objetos que se crean.

- Útil cuando una clase no sabe de antemano qué clase de objetos necesita crear.

**Abstract Factory:**

- Proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas.

- Útil para aplicaciones que necesitan trabajar con múltiples "familias" de productos, como interfaces de usuario para diferentes sistemas operativos.

**Builder:**

- Separa la construcción de un objeto complejo de su representación, permitiendo crear diferentes representaciones del mismo proceso de construcción.

- Útil para construir objetos que requieren múltiples pasos y configuraciones.

**Prototype:**

- Permite crear nuevos objetos clonando una instancia existente.

- Útil cuando la creación de una nueva instancia es costosa y se puede utilizar una copia de una instancia existente.