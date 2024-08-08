/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg10;

/**
 *
 * @author Juan Felipe Rubio
 */

// Interfaz Cloneable
interface Prototype extends Cloneable {
    Prototype clone();
}

// Clase concreta que implementa Cloneable
class ConcretePrototype implements Prototype {
    private String name;

    public ConcretePrototype(String name) {
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.name);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{name='" + name + "'}";
    }
}
