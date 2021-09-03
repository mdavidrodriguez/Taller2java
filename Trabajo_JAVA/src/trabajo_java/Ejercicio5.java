package trabajo_java;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[]args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Programa lee un caracter e imprime su valor numerico");
        String s = "";
        System.out.println("Digite una letra: ");
        s = sc.nextLine();
       
        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println("Valor numerico en la tabla ASCII: "+bytes[0]);
        System.out.println("Hecho X Mateo Rodriguez");
        
    }
}                                 
    
