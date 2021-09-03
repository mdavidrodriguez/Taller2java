package trabajo_java;

import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[]args){
        System.out.println("Programa para calcular el indice de mas corporal de una persona");
        Scanner teclado=new Scanner(System.in);
        
        double peso, estatura,imc;
        System.out.println("Escriba su peso en kg: ");
        peso = teclado.nextDouble();
        System.out.println("Escriba su estatura: ");
        estatura = teclado.nextDouble();
        
        imc = peso/(estatura*estatura);
        System.out.println("Su indice de masa corporal es: "+ imc);
        System.out.println("Hecho x Mateo Rodriguez");
        
    }
    
}
