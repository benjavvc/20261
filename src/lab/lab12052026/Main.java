package lab.lab12052026;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        ArrayList<Sismos> sismos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
            try {
                System.out.println("Ingrese la región del sismo");
                String reg = sc.next();
                System.out.println("Ingrese el epicentro del sismo");
                String epicentro = sc.next();
                System.out.println("Ingrese la magnitud del sismo");
                float magnitud = sc.nextFloat();
                Sismos a = new Sismos(reg, epicentro, magnitud);
                sismos.add(a);
                System.out.println("sismo agregado");
            }catch (InputMismatchException e) {
                System.out.println("La magnitud debe ser float");
            }catch (SismoInavalidoException e) {
                System.out.println(e.getMessage());
            }
    }
}
