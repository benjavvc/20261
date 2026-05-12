package clases.clase06052026;

import java.util.Scanner;

public class IOEnteros {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;

         numero= lee(sc);
        System.out.println("El numero es: "+numero);
    }
    private static int lee(Scanner sc) {
        String enteroStr;
        int entero;
        do {
            System.out.println("Digite um numero entero: ");
            enteroStr = sc.next();
            try {

                entero = Integer.parseInt(enteroStr);
                return entero;
            }catch(NumberFormatException e) {
                System.out.println("\n Error digito un caracter no un numero");
            }
        }while (true);
    }
}
