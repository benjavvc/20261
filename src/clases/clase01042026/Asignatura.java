package clases.clase01042026;

import java.util.ArrayList;

public class Asignatura {
    private int codigo;
    private String nombre;
    private int nroCreditos;
    private byte semestre;
    private Carrera carrera;
    private ArrayList<Asignatura> prerrequistos=new ArrayList();

    public Asignatura(int nroCreditos, String nombre, int codigo, byte semestre, Carrera carrera) {
        this.nroCreditos = nroCreditos;
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNroCreditos() {
        return nroCreditos;
    }

    public void setNroCreditos(int nroCreditos) {
        this.nroCreditos = nroCreditos;
    }

    public byte getSemestre() {
        return semestre;
    }
    public boolean addPrerrequisito(Asignatura asignatura) {
        for(Asignatura a:prerrequistos){
            if(a.getCodigo()==asignatura.getCodigo()){
                return false;
            }
        }
        prerrequistos.add(asignatura);
        return true;
    }
    public boolean removePrerrequisito(Asignatura asignatura) {
        for (Asignatura a : prerrequistos) {
            if (a.getCodigo() == asignatura.getCodigo()) {
                prerrequistos.remove(a);
                return true;
            }
        }
        return false;
    }
    public Asignatura[] getPrerrequistos() {
        return prerrequistos.toArray(new Asignatura[0]);
    }

    public Carrera getCarrera() {
        return carrera;
    }
}
