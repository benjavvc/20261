package clases.clase01042026;

import java.util.ArrayList;

public class Carrera {
    private int codigo;
    private String nombre;
    ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

    public Carrera(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    public boolean addAsignatura(Asignatura asignatura) {
        for (Asignatura c : asignaturas) {
            if (c.getCodigo()==asignatura.getCodigo()) {
                return false;
            }
        }
        asignaturas.add(asignatura);
        return true;
    }
    public boolean removeAsignatura(Asignatura asignatura) {
        for (Asignatura c : asignaturas) {
            if (c.getCodigo()==asignatura.getCodigo()) {
                asignaturas.remove(c);
                return true;
            }
        }
        return false;
    }
    public int getTotalCreditosSCT() {
        int totalCreditos = 0;
                for (Asignatura asignatura : asignaturas) {
                    totalCreditos += asignatura.getNroCreditos();
                }
                return totalCreditos;
    }
    public Asignatura[] getAsignaturas() {
        return asignaturas.toArray(new Asignatura[0]);
    }
    public Asignatura[] getAsignaturasPorSemestre(byte semestre) {
    int contador = 0;
    for (Asignatura asignatura : asignaturas) {
        if (asignatura.getSemestre() == semestre) {
            contador++;
        }
    }
    Asignatura[] asignaturas2 = new Asignatura[contador];
    int contador2 = 0;
    for (Asignatura asignatura : asignaturas) {
        if (asignatura.getSemestre() == semestre) {
            asignaturas2[contador2] = asignatura;
            contador2++;
        }
    }
    return asignaturas2;
    }
}
