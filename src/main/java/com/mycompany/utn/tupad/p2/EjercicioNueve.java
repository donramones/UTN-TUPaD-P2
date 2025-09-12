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
public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); //scanner.nextInt() se utiliza para numeros enteros en cambio scanner.nextLine() lee toda la línea de texto que el usuario ingresa.
        System.out.println("Hola, " + nombre);
    }
    
}
