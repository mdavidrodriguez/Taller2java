package trabajo_java;

import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[]args){
    Scanner entrada = new Scanner (System.in);  
    System.out.println("Programa que pide al usario tres numeros e imprime la suma, promedio, producto,cociente y modulo");
    double valor1, valor2, valor3, suma, producto, cociente, modulo;
    
   System.out.println("Introduzca el primer valor: ");
    valor1 = entrada.nextDouble();
   
    System.out.println("Introduzca el segundo valor: ");
    valor2 = entrada.nextDouble();
    
    System.out.println("Introduzca el tercer valor: ");
    valor3 = entrada.nextDouble();
    
    suma = (valor1+valor2+valor3);
    producto = (valor1*valor2*valor3);
    cociente = (valor1/valor2/valor3);
    modulo = (valor1%valor2%valor3);
    
    System.out.printf("\nLa suma de los dos valores es => %.2f\n", suma);
    System.out.printf("\nEl producto de los tres valores es => %.2f\n", producto);
    System.out.printf("\nEl cociente de los tres valores es: => %.2f\n", cociente);
    System.out.printf("\nLa diferencia de los dos valores es => %.2f\n", modulo);
    
    System.out.println("\nHecho X Mateo Rodriguez");
    }
    
}
    

