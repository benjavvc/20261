package clase18032026;

import java.util.Scanner;

public class DemoPunto {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese los puntos que desea añadir:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Punto p=new Punto(x,y);
        System.out.println("ingrese la distancia que desea mover los puntos:");
        int disx=sc.nextInt();
        int disy=sc.nextInt();
        p.traslada(x,y);
        System.out.println("El punto"+p.toString());
        System.out.println("El punto se traslado la distancia de:"+p.distancia());
    }
}
