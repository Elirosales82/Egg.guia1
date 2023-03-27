/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egg.guia1.ejercicios3;

import java.util.Scanner;

/**
 *
 * @author 54113
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("Su frase en mayuscula: " + frase.toUpperCase());
        System.out.println("Su frase en minuscula: " + frase.toLowerCase());
    }
}
