/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia.pkg13;

/**
 *
 * @author Juan Felipe Rubio
 */

abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);
}

class BasicSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Basic")) {
            System.out.println("Basic support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class TechnicalSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Technical")) {
            System.out.println("Technical support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

class AdvancedSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("Advanced")) {
            System.out.println("Advanced support handled the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}


