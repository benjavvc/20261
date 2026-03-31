package lab.lab31032026;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class DemoVeterinaria {
    static void main() {
        Scanner sc = new Scanner(System.in);
        ArrayList<PacienteMascota> listaMascotas = new ArrayList<>();
        System.out.println("CREANDO A PACIENTE CANINO");
        System.out.println("Ingrese el nombre del paciente");
        String nombre = sc.next();
        System.out.println("Ingrese la especie del paciente");
        String especie = sc.next();
        System.out.println("Ingrese el nombre del dueño del paciente");
        String nomDueño = sc.next();
        System.out.println("Ingrese el peso Ideal del paciente");
        int pesoIdeal = sc.nextInt();
        listaMascotas.add(new PacienteMascota(nombre,Especie.valueOf(especie),pesoIdeal,nomDueño));
        System.out.println("CREANDO A PACIENTE FELINO");
        System.out.println("Ingrese el nombre del paciente");
        String nombre2 = sc.next();
        System.out.println("Ingrese la especie del paciente");
        String especie2 = sc.next();
        System.out.println("Ingrese el nombre del dueño del paciente");
        String nomDueño2 = sc.next();
        System.out.println("Ingrese el peso Ideal del paciente");
        int pesoIdeal2 = sc.nextInt();
        listaMascotas.add(new PacienteMascota(nombre2,Especie.valueOf(especie2),pesoIdeal2,nomDueño2));
        System.out.println("CREANDO A PACIENTE EXOTICO");
        System.out.println("Ingrese el nombre del paciente");
        String nombre3 = sc.next();
        System.out.println("Ingrese la especie del paciente");
        String especie3 = sc.next();
        System.out.println("Ingrese el nombre del dueño del paciente");
        String nomDueño3 = sc.next();
        System.out.println("Ingrese el peso Ideal del paciente");
        int pesoIdeal3 = sc.nextInt();
        listaMascotas.add(new PacienteMascota(nombre3,Especie.valueOf(especie3),pesoIdeal3,nomDueño3));
        int opcion;
        do {
            System.out.println("Ingrese una opción, si es primera vez");
            System.out.println(" 1.Listar PacienteS" +
                    "\n 2.Dias para Vacuna" +
                    "\n 3.Actualizar Nombre de la red a Letirinaria");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    for (PacienteMascota P : listaMascotas){
                        System.out.println(P);
                    }
                    break;
                  case 2:
                    System.out.println("DIAS PARA VACUNAS");
                      for (PacienteMascota p : listaMascotas) {
                          if (p.getEspecie() == Especie.CANINO) {
                              p.setFechaProximaVacuna(LocalDate.of(2026, 4, 15));
                          }
                          if (p.getEspecie() == Especie.FELINO) {
                              p.setFechaProximaVacuna(LocalDate.of(2026, 5, 10));
                          }
                          if (p.getEspecie() == Especie.EXOTICO) {
                              p.setFechaProximaVacuna(LocalDate.of(2026, 6, 5));
                          }
                          System.out.println(p.getNombreMascota() + ": " + p.DiasParaVacuna());
                      }
                      break;
                    case 3:
                        System.out.println("MODIFICAR NOMBRE DE RED A Letirinaria");
                        PacienteMascota.ActualizarNombreRed("Letirinaria");
                        break;
            }
        }while (opcion != 4);
    }
}
