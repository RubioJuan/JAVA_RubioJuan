/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg10;

/**
 *
 * @author Juan Felipe Rubio
 */

// Interfaz Producto
interface Product {
    void use();
}

// Implementaciones concretas de Producto
class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("Usando el producto A");
    }
}

class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("Usando el producto B");
    }
}

// Creador abstracto
abstract class Creator {
    public abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        product.use();
    }
}

// Creadores concretos
class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}


