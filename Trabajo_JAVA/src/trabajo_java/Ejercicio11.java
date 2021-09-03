package trabajo_java;

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa que lee una cantidad numerica entre 1-1000 e imprime las cifras correspondientes(unidad,decenas,centenas)");
        int numero,unidades, decenas, centenas;
        
        System.out.println("Introduzca un numero entre 0 y 1000: ");
        numero= sc.nextInt();
        if ((numero >1) && (numero<1000)){
            
            unidades=numero%10;
            numero=numero/10;
            decenas=numero%10;
            numero=numero/10;
            centenas=numero%10; 
            
            System.out.println("Unidad: " + unidades);
            System.out.println("Decena: " + decenas);
            System.out.println("centena: " + centenas);
        
        
            }else{
                System.out.println("Digite solamente un numero entre 0 y 1000");
                   
            System.out.println("Hecho X Mateo Rodriguez");
          
        }
        
    }
    
}
    
