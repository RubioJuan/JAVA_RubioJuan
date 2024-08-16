/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg13;

/**
 *
 * @author Juan Felipe Rubio
 */

interface VendingMachineState {
    void insertCoin();
    void selectProduct();
}

class WaitingForCoinState implements VendingMachineState {
    public void insertCoin() {
        System.out.println("Coin inserted.");
    }

    public void selectProduct() {
        System.out.println("Please insert a coin first.");
    }
}

class ProductSelectedState implements VendingMachineState {
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    public void selectProduct() {
        System.out.println("Product selected.");
    }
}

class VendingMachine {
    private VendingMachineState currentState;

    public VendingMachine() {
        currentState = new WaitingForCoinState();
    }

    public void setState(VendingMachineState state) {
        this.currentState = state;
    }

    public void insertCoin() {
        currentState.insertCoin();
        setState(new ProductSelectedState());
    }

    public void selectProduct() {
        currentState.selectProduct();
    }
}
