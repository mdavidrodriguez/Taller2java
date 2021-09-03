package trabajo_java;

import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[]args){
    Scanner entrada = new Scanner (System.in);  
    System.out.println("Programa que pide al usario dos numeros e imprime el suma, producto y diferencia");
    int valor1;
    int valor2;
    int suma;
    int producto;
    int diferencia;
    
    System.out.println("Introduzca el primer valor: ");
    valor1 = entrada.nextInt();
    
    System.out.println("Introduzca el segundo valor: ");
    valor2 = entrada.nextInt();
    
    suma = valor1 + valor2;
    producto = valor1 * valor2;
    diferencia = valor1 - valor2;
    
    System.out.printf("\nLa suma de los dos valores es: %d\n ",suma);
    System.out.printf("\nEl producto de los dos valores es: %d\n",producto);
    System.out.printf("\nLa diferencia de los dos valores es: %d\n",diferencia);
    
    System.out.println("Hecho X Mateo Rodriguez");
    
    }
            

     
}
