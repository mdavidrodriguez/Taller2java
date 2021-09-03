package trabajo_java;

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[]args){
        Scanner sn = new Scanner(System.in);
        System.out.println("Programa que lee el peso de un objeto en kg e imprime sus equivalencias en gramos,libras,toneladas");
        double pesokg, gramos, toneladas, libras;
        System.out.println("Escriba el peso del objeto en kg: ");
        pesokg = sn.nextDouble();
        
        gramos = pesokg * 1000;
        libras = pesokg * 2.205;
        toneladas = pesokg / 1000;
        
        System.out.printf("Su equivalencia en gramos es de => %.0f\n",gramos);
        System.out.printf("Su equivalencia en libras es de => %.0f\n",libras);
        System.out.println("Su equivalencia en toneladas es de: " + toneladas);
        
        System.out.println("Hecho X Mateo Rodriguez");
        
        
    }
    
}
