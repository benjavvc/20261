package lab.lab30032026;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoVehiculos {
    static void main() {
        ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("------BIENVENIDO AL SISTEMA DE VEHICULOS DE CARRERA------");
            System.out.println("OPCIONES:" +
                    "1.REGISTRAR VEHICULOS" +
                    "2.LISTAR VEHICULOS" +
                    "3.DIAS RESTANTES PARA LA CARRERA" +
                    "4.MODIFICAR MARCA");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el peso de el vehiculo:");
                    int peso = sc.nextInt();
                    System.out.println("Ingrese el color del vehiculo:");
                    String color = sc.next();
                    System.out.println("Ingrese la potencia del vehiculo:");
                    int potencia = sc.nextInt();
                    System.out.println("Selecciones una categoria para que su vehiculo compita:" +
                            "1.WEC" +
                            "2.F1" +
                            "3.IMSA");
                    int op=sc.nextInt();
                    switch (op) {
                        case 1:
                            Vehiculo v=new Vehiculo(peso,color,potencia);
                            v.setCategoria(Categoria.WEC);
                            vehiculos.add(v);
                            break;
                            case 2:
                                Vehiculo v1=new Vehiculo(peso,color,potencia);
                                v1.setCategoria(Categoria.F1);
                                vehiculos.add(v1);
                                break;
                                case 3:
                                    Vehiculo v2=new Vehiculo(peso,color,potencia);
                                    v2.setCategoria(Categoria.IMSA);
                                    vehiculos.add(v2);
                                    break;
                    }
                    break;
                    case 2:
                        listarVehiculos(vehiculos);
                        break;
                        case 3:
                            System.out.println("Ingrese a la marca que desea cambiar");
                            String marca = sc.next();
                            for(Vehiculo v:vehiculos){
                            }
            }
        }while (opcion != 5);
    }
    public static void listarVehiculos(ArrayList<Vehiculo> vehiculos){
        if(vehiculos.isEmpty()){
            for (Vehiculo v : vehiculos) {
                System.out.println(v.toString());
            }
        }else{
            System.out.println("No existen el vehiculos");
        }
    }
}
