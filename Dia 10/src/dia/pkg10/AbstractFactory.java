/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg10;

/**
 *
 * @author Juan Felipe Rubio
 */

// Productos Abstractos
interface Button {
    void paint();
}

interface Checkbox {
    void paint();
}

// Productos Concretos
class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Pintando un botón de Windows");
    }
}

class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Pintando un botón de Mac");
    }
}

class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Pintando un checkbox de Windows");
    }
}

class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Pintando un checkbox de Mac");
    }
}

// Abstract Factory
interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Factories Concretas
class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}

class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}

// Uso del Abstract Factory
public class AbstractFactory {
    private Button button;
    private Checkbox checkbox;

    public AbstractFactory(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
