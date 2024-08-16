/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg13;

/**
 *
 * @author Juan Felipe Rubio
 */

interface Command {
    void execute();
}

class OpenCommand implements Command {
    public void execute() {
        System.out.println("Opening file...");
    }
}

class SaveCommand implements Command {
    public void execute() {
        System.out.println("Saving file...");
    }
}

class Menu {
    private Command openCommand;
    private Command saveCommand;

    public Menu(Command open, Command save) {
        this.openCommand = open;
        this.saveCommand = save;
    }

    public void clickOpen() {
        openCommand.execute();
    }

    public void clickSave() {
        saveCommand.execute();
    }
}

