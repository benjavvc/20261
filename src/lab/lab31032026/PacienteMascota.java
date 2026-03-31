package lab.lab31032026;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class PacienteMascota {
    private static String nombreRedVeterinaria="VetPlus";
    private String nombreMascota;
    private Especie especie;
    private int pesoIdeal;
    private String nombreDueño;
    private LocalDate fechaProximaVacuna;

    public PacienteMascota(String nombreMascota, Especie especie, int pesoIdeal, String nombreDueño) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.pesoIdeal = pesoIdeal;
        this.nombreDueño = nombreDueño;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public int getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public LocalDate getFechaProximaVacuna() {
        return fechaProximaVacuna;
    }

    public void setFechaProximaVacuna(LocalDate fechaProximaVacuna) {
       this.fechaProximaVacuna=fechaProximaVacuna;
    }
    public int DiasParaVacuna(){
        long diasRestante= ChronoUnit.DAYS.between(fechaProximaVacuna, LocalDate.now());
        return diasRestante <= 0 ? 0:(int)diasRestante;
    }
    public static String ActualizarNombreRed(String nuevoNombre){
        nombreRedVeterinaria=nuevoNombre;
        return nombreRedVeterinaria;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PacienteMascota that)) return false;
        return Objects.equals(nombreMascota, that.nombreMascota) && Objects.equals(nombreDueño, that.nombreDueño);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombreMascota, nombreDueño);
    }

    @Override
    public String toString() {
        return "PacienteMascota{" +
                "nombreMascota='" + nombreMascota + '\'' +
                ", especie=" + especie +
                ", pesoIdeal=" + pesoIdeal +
                ", nombreDueño='" + nombreDueño + '\'' +
                ", fechaProximaVacuna=" + fechaProximaVacuna +
                '}';
    }
}
