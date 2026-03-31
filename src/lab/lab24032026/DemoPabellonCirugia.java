package lab.lab24032026;

import java.util.Scanner;

public class DemoPabellonCirugia {
    private static Scanner sc = new Scanner(System.in);
    PabellonCirugia[] pabellones=new PabellonCirugia[6];
    static void main() {
        DemoPabellonCirugia demo = new DemoPabellonCirugia();
        int op;
        do {
            System.out.println("Ingrese una opcion: ");
            System.out.println("1. Crear Pabellon Cirugia");
            System.out.println("2. Listar Pabellones de Cirugia");
            op=sc.nextInt();
            switch (op){
                case 1:
                    demo.procesa();
                    break;
                case 2:
                    for (int i = 0; i < demo.pabellones.length; i++) {
                        if(demo.pabellones[i]!=null){
                            System.out.println(demo.pabellones[i].toString());
                        }
                    }
            }
        }while (op!=2);

    }
    public void procesa(){
        for (int i = 0; i < pabellones.length; i++) {
            System.out.print("Introduce el número de la Pabellon que va a crear: ");
            int numero=sc.nextInt();
            System.out.print("Ingrese la especialidad del pabellon: ");
            String especialidad=sc.next();
            pabellones[i]=new PabellonCirugia(numero,especialidad);
            if (pabellones[i]!=null){
                if ( i % 2==0) {
                    pabellones[i].setEstado(Estado.DISPONIBLE);
                }else{
                    pabellones[i].setEstado(Estado.OCUPADO);
                }
            }
        }
    }
}
