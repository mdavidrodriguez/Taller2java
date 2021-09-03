package trabajo_java;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[]args){
        Scanner sn = new Scanner (System.in);
        System.out.println("Programa que muestra por pantalla un menu de cinco opciones");
        boolean salir = false;
        int opcion; 
        
        while(!salir){
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 1");  
            System.out.println("3. Opcion 1");
            System.out.println("4. Opcion 1");
            System.out.println("5. Salir");
            
            try{
                System.out.println("Escoja una opcion: ");
                opcion = sn.nextInt();
        
                switch(opcion){
                    case 1:
                        System.out.println("Elegiste la opcion 1");
                        break;
                    case 2:
                        System.out.println("Elegiste la opcion 2");
                        break;
                    case 3:
                        System.out.println("Elegiste la opcion 3");
                        break;
                    case 4:
                        System.out.println("Elegiste la opcion 4");
                        break;
                    case 5:
                        System.out.println("Elegiste la opcion 5");
                        System.out.println("Muchas Gracias por usar el menu");
                        System.out.println("Hecho X Mateo Rodriguez");
                        salir=true;
                        break;
                    default:
                        System.out.println("Solo se permite un numero entre 1 y 5");
                }  
            } catch (InputMismatchException e){
                System.out.println("Debes elegir un numero");
                sn.next();
            }
                
        }
        
    }
}
    

