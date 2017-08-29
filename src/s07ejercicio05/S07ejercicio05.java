/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando nuevo objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Mostrando mensaje al usuario
        System.out.println("Ingrese la cantidad de agua en kilogramo");
        double kilogramos= input.nextDouble();
        
        System.out.print("Ingrese la temperatura inicial: ");
        double temperaturainicial= input.nextDouble();
        
        System.out.println("Ingrese la temperatura final: ");
        double temperaturafinal = input.nextDouble();
        
        //Calculando la energia
        double energia = kilogramos * (temperaturafinal - temperaturainicial)*4184;
        
        //Mostrando resultado
        System.out.println("La energia requeria es: " + energia + "jules");
        
    }
    
}
