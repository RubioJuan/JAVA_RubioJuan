/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia.pkg10;

/**
 *
 * @author Juan Felipe Rubio
 */

/*

// Uso del Singleton
public class Dia10 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
*/

/*
// Uso del Factory Method
public class Dia10 {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation();  // Salida: Usando el producto A

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation();  // Salida: Usando el producto B
    }
}
*/

/*

// Uso del Abstract Factory
public class Dia10 {
    public static void main(String[] args) {
            GUIFactory factory = new WinFactory();
            AbstractFactory app = new AbstractFactory(factory);
            app.paint();  // Salida: Pintando un botón de Windows, Pintando un checkbox de Windows

            factory = new MacFactory();
            app = new AbstractFactory(factory);
            app.paint();  // Salida: Pintando un botón de Mac, Pintando un checkbox de Mac
        }
}*/

// Uso del Builder
/*
public class Dia10{
        public static void main(String[] args) {
            Pizza pizza = new Pizza.Builder()
                                .setDough("Crispy")
                                .setSauce("Tomato")
                                .setTopping("Cheese")
                                .build();
            System.out.println(pizza);  // Salida: Pizza [dough=Crispy, sauce=Tomato, topping=Cheese]
        }
}*/

// Uso del Prototype
public class Dia10{
  public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Original");
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        System.out.println(original);  // Salida: ConcretePrototype{name='Original'}
        System.out.println(clone);     // Salida: ConcretePrototype{name='Original'}
    }
}