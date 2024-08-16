/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia.pkg13;

/**
 *
 * @author Juan Felipe Rubio
 */

/*
// Uso del Chain of Responsaibility
public class Main {
    public static void main(String[] args) {
        SupportHandler basic = new BasicSupport();
        SupportHandler technical = new TechnicalSupport();
        SupportHandler advanced = new AdvancedSupport();

        basic.setNextHandler(technical);
        technical.setNextHandler(advanced);

        basic.handleRequest("Technical");
    }
}
*/

/*
// Uso de Command
public class Main {
    public static void main(String[] args) {
        Command open = new OpenCommand();
        Command save = new SaveCommand();

        Menu menu = new Menu(open, save);
        menu.clickOpen();
        menu.clickSave();
    }
}
*/


/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Uso de Iterator
public class Main {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Item1");
        items.add("Item2");
        items.add("Item3");

        Iterator<String> iterator = items.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
*/

/*
// Uso de Observer
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.notifyObservers("New update available!");
    }
}
*/

// Uso de State
public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.insertCoin();
        machine.selectProduct();
    }
}

