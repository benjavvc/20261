package clase20032026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DemoEstudiante {
    static void main() {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Estudiante e=new Estudiante("11.111.111-1","Laura Diaz");
        e.setEmail("ldiaz@jmail.com");
        System.out.println(e.toString());
        System.out.println("-----------------------------");
        System.out.println("Ingrese el estado que desea asignarle al estudiante:"+e.getNombre());
        System.out.println("Estados\n" +
                "\nNO_VIGENTE" +
                "\n REGULAR" +
                " \nSUSPENCION_DE_ESTUDIO" +
                " \nPERDIDA_CARRERA" +
                " \nTERMINAL" +
                " \nEGRESADO" +
                " \nTITULADO");
        System.out.print("Ingrese:");
        String estado=sc.next();
        estado=estado.toUpperCase();
        e.setEstado(EstadoEstudiante.valueOf(estado));
        switch (e.getEstado()) {
            case NO_VIGENTE:e.setEstado(EstadoEstudiante.NO_VIGENTE);
            break;
            case REGULAR:e.setEstado(EstadoEstudiante.REGULAR);
            break;
            case SUSPENCION_DE_ESTUDIO:e.setEstado(EstadoEstudiante.SUSPENCION_DE_ESTUDIO);
            break;
            case TERMINAL:e.setEstado(EstadoEstudiante.TERMINAL);
            break;
            case EGRESADO:e.setEstado(EstadoEstudiante.EGRESADO);
            break;
            case PERDIDA_CARRERA:e.setEstado(EstadoEstudiante.PERDIDA_CARRERA);
            break;
            case TITULADO:e.setEstado(EstadoEstudiante.TITULADO);
            break;
        }
        System.out.println("Nuevo estado del estudiante:"+e.getNombre()+" " +
                "\nes: "+e.getEstado());
        estudiantes.add(e);
        System.out.println("Ingrese un nuevo estudiante");
        System.out.print("Ingrese Rut:");
        String estR=sc.next();
        System.out.println("Ingrese nombre:");
        String estN=sc.next();
        System.out.println("Ingrese email:");
        String estE=sc.next();
      Estudiante e2=new Estudiante(estR,estN);
      e2.setEmail(estE);
        estudiantes.add(e2);
        System.out.println("REPORTE DE ESTUDIATES ACTUALIZADO"+estudiantes.toString());
        sc.close();
    }
}
