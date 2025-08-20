/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rivar
 */

import java.util.Scanner;
public class EjercicioCuatro {
    
    public static void main(String[] args) {
        // 1. Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // 2. Solicitar y leer el nombre
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        // 3. Solicitar y leer la edad
        System.out.print("Ahora, ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Limpiar el búfer del scanner. Esto es importante si después de nextInt()
        // se usa otro nextLine() para evitar que se salte la lectura.
        scanner.nextLine();

        // 4. Mostrar la información capturada
        System.out.println("---"); // Separador para mejor visualización
        System.out.println("Hola, " + nombre + "!");
        System.out.println("Tienes " + edad + " años.");

        // 5. Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}
