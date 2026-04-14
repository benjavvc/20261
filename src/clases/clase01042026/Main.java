package clases.clase01042026;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de carrera va a ingresar");
        int n = sc.nextInt();
        System.out.println("Ingrese la cantidad de Asignaturas que tendrá");
        int m = sc.nextInt();
        Carrera[] carreras = new Carrera[n];
        Asignatura[] asignaturas = new Asignatura[m];
        for(int i=0; i<n; i++){
            System.out.println("Ingrese el codigo de la carrera a crear");
            int codigo = sc.nextInt();
            System.out.println("Ingrese el nombre de la carrera "+(i+1)+":");
            String nombre = sc.next();
            Carrera carrera = new Carrera(codigo, nombre);
            carreras[i] = carrera;
            for(int j=0; j<m; j++){
                System.out.println("Ingrese el codigo de la asignatura asignatura "+(j+1)+":");
                int codigoAsignatura = sc.nextInt();
                System.out.println("Ingrese el nombre de la asignatura "+(j+1)+":");
                sc.nextLine();
                String nombreAsignatura = sc.nextLine();
                System.out.println("Ingrese el número de créditos que necesita la asignatura "+(j+1)+":");
                int nroCreditos = sc.nextInt();
                System.out.println("Ingrese el semestre donde se debe cursar la asignatura "+(j+1)+":");
                byte semestre = sc.nextByte();

                Asignatura asignatura=new Asignatura(nroCreditos,nombreAsignatura,codigoAsignatura,semestre,carrera);
                System.out.println("Prerrequisito:");
                System.out.println("Opciones");
                System.out.println("1.Sí");
                System.out.println("2.No");
                int opcion = sc.nextInt();
                if(opcion==1){
                    asignatura.addPrerrequisito(asignatura);
                }else if(opcion==2){
                    asignatura.removePrerrequisito(asignatura);
                }
                carreras[i].addAsignatura(asignatura);
            }
        }
        for(int i=0; i<n; i++){
            System.out.println("Carrera:"+carreras[i].getNombre());
            Asignatura[] lista = carreras[i].getAsignaturas();
            for (Asignatura a : lista) {
                System.out.println("Asignaturas: " + a.getNombre() +
                        " | Semestre: " + a.getSemestre() +
                        " | Créditos: " + a.getNroCreditos()+
                        " |Prerrequisitos:"+a.getPrerrequistos());
            }
        }
    }
}
