package trabajo_java;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int num1=2, num2;
        System.out.println("Ingrese primer valor: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese segundo valor: ");
        num2 = sc.nextInt();
        
                
        System .out.printf("num1 = %d\n", num1 );
        System.out.printf("El valor de %d + %d es %d\n", num1, num1, (num1 + num1));
        System.out.printf("num1 =", num1);
        System.out.printf("%d - %d\n", ( num1 + num2), ( num1 + num2));
          
        
    }
    
}
