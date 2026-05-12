package clases.Practico11052026;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese el nombre del usuario:");
            String nombre = sc.next();
            System.out.println("Ingrese el edad del usuario:");
            int edad = sc.nextInt();
            Usuario u = new Usuario(nombre, edad);
            System.out.println(u);
        }catch(EdadInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
