package clases.clase17032026;

import java.util.Scanner;

public class Cafeteria {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cafes que desea registrar");
        int cantidad = sc.nextInt();
        double total=0;
        int cafes=0;
        do {

            double precio=0;
            System.out.println("ingresa el cafe que deas ordenar");
            String nombre = sc.next();
            System.out.println("ingresa el tamaño del cafe que deas ordenar");
            String tamanio = sc.next();
            if (tamanio.equalsIgnoreCase("Grande")) {
                System.out.println("precio del cafe es $2.000");
                precio = 2000;
            }else if (!tamanio.equalsIgnoreCase("Grande")) {
                precio=1000;
            }
            total=precio*cantidad;
            Cafe cafe=new Cafe(nombre,tamanio,precio,cantidad);
            cafes++;
        }while(cantidad==cafes );
        System.out.println("cantidad de cafes ordenados: " + cantidad+" total: "+total);
    }
}
