/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package ejercicioaprendizaje2;

import java.util.Scanner;

public class EjercicioAprendizaje2 {
    public static void main(String[] args) {
        String nombre;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Tu nombre es: "+nombre);
    }
    
}
