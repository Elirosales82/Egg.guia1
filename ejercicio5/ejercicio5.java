/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.guia1.ejercicio5;

import java.util.Scanner;
/**
 *
 * @author 54113
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un número entero");
        int num1 = leer.nextInt();
        //double raiz =  Math.sqrt(num1)
        
        System.out.println("El doble del valor ingresado es: " + (num1*2));
        System.out.println("El triple del valor ingresado es: " + (num1*3));
        System.out.println("La raiz cuadrada del valor ingresado es: " + Math.sqrt(num1));
    }
    
}
