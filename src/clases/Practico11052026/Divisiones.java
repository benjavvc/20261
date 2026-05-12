package clases.Practico11052026;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisiones {
    static void main() {
        Scanner sc=new Scanner(System.in);
        double d;
        try{
            System.out.println("Ingrese dos números enteros");
            int nu1=sc.nextInt();
            int nu2=sc.nextInt();
             d=nu1/nu2;
            System.out.println("Resultado de la division:"+d);
        }catch(ArithmeticException e){
            System.out.println("Error no se puede dividir por 0");
        }catch(InputMismatchException e){
            System.out.println("Datos no numericos");
        }
    }
}
