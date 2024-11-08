/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_eva2_24550284;

import java.util.Scanner;

/**
 *
 * @author samue
 */
public class EXAMEN_EVA2_24550284 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double x, y, z, usr;
        Scanner captu = new Scanner(System.in);
        System.out.println("Bienvenido al juego de piedra papel o tijeras");
        System.out.println("Reglas: ");
        System.out.println("1: Piedra");
        System.out.println("2: Papel");
        System.out.println("3: Tijeras");
        System.out.println("Ingresa cualquiera de los numeros y el programa generara de manera aleatoria otro numero entre 1 y 3");
        System.out.println("Asi queda:");
        System.out.println("1 gana a 3 pero pierde ante 2 y 1 y 1 queda empate");
        System.out.println("2 le gana a 1 pero pierde ante 3 y 2 y 2 son empate");
        System.out.println("3 le gana a 2 pero pierde ante 1 y 3 y 3 son empate");
        System.out.println("Ingresa un numero entre 1 y 3 (Piedra, papel o tijeras)");
        usr = captu.nextDouble();
        x = Math.random();
        
        
        while(x >= 1 && x <=3){
            if(x == 1 && usr == 1){
                System.out.println("Empate");
            }
        }
    }
    
    
}
