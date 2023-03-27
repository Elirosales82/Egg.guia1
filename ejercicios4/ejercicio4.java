/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.guia1.ejercicios4;

import java.util.Scanner;

/**
 *
 * @author 54113
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la temperatura");
        int temp = leer.nextInt();
        System.out.println("La temperatura ingresado expresada en graods Fahrenheit es de: " + (32+(9*temp/5)));
        }
    
}
