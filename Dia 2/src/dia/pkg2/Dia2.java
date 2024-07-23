/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dia.pkg2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Dia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entero = 10;
        double decimal = 20.5;
        char caracter = 'A';
        boolean elbooleano = true;
        byte unByte = 100;
        short unShort = 30000;
        long unLong = 1000000000000000L;
        float unFloat = 30.5f;
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        System.out.println("Por favor ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Tu nombre es: "+nombre);
        
        for (int i = 0; i<5; i=i+1){
            System.out.println(i);
        }
        boolean booleanito = false;
        if (booleanito == true){
         System.out.println("Soy trueee zunguita...y coma callado menor");
        } else if(booleanito == false){
            System.out.println("Mala mia bro....Pero igual coma callado");
        } 
        
        while(booleanito == false){
            System.out.println("Soy mero falso peo");
            booleanito = true;
        }
        
        String valorSwitch = "";
        switch(valorSwitch){
            case "A":
                System.out.println("Hi, i'm A");
                break;
            case "B":
                System.out.println("Hi, i'm B");
                break;
            default:
                 System.out.println("No soy A ni B, soy algo diferente");
                 break;
        }
        
        int[]array = new int[10];
        array[0]=1;
        for (int i=0; i<array.length;i++){
            System.out.println(array[1]);{
        
            ArrayList<String> lista = new ArrayList<>();
            lista.add("Pepe");
            
            System.out.println(lista);
        }
        }
    }
}
