package trabajo_java;

import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        System.out.println("Programa para calcular longitud y area de una circuferencia");
        Scanner sc = new Scanner(System.in);
        double radio, longitud, area;
        System.out.println("Introduce el radio de la circuferencia: ");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio,2);
        System.out.printf("La longitud de la circuferencia es => %.2f\n",longitud);
        System.out.printf("El Area de la circuferencia es => %.2f\n", area);
        
        System.out.println("Hecho X Mateo Rodriguez");
    }
    
}
