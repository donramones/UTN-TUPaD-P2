/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.utn.tupad.p2;

/**
 *
 * @author rivar
 */
import java.util.Scanner;
public class EjercicioOcho {
    public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Dividir de números enteros");
    System.out.println("Ingresa el primer número (entero): ");
    Double num1 = Double.parseDouble(input.nextLine());
    System.out.print("Ingresa el segundo número (entero): ");
    Double num2 = Double.parseDouble(input.nextLine());
    
    Double resultadoEntero = num1 / num2;
    System.out.println("El resultado de la división entera es: " + resultadoEntero);
    
         
    }
    
}
