package clases.clase08052026.ArchivoDeTexto;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private String nombre;
   private String direccion;
    private LocalDate fechaDeNacimiento;
    private EstadoCivil estadoCivil;
    private float estatura;

    public Persona(String nombre, String direccion, LocalDate fechaDeNacimiento, EstadoCivil estadoCivil, float estatura) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estadoCivil = estadoCivil;
        this.estatura = estatura;
    }
    public int getEdad(){
        int edad= Period.between(this.fechaDeNacimiento,LocalDate.now()).getYears();
        return edad;
    }

    @Override
    public String toString() {
        return nombre+";"+direccion+";"+getEdad()+";"+estadoCivil+";"+estatura;
    }
}
