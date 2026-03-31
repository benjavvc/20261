package clases.clase23032026;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Medicamento {
    private String nombre;
    private Tipo presentación;
    private LocalDate fechaVencimiento;

    public Medicamento(String nombre, Tipo presentación, LocalDate fechaVencimiento) {
        this.nombre = nombre;
        this.presentación = presentación;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Tipo getPresentación() {
        return presentación;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    public int getDiasValidez(){
       long dias = ChronoUnit.DAYS.between(LocalDate.now(),this.fechaVencimiento);
       return dias<=0?0:(int)dias;
    }

    @Override
    public String toString() {
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yy");
        String fecha=this.fechaVencimiento.format(formato);
        return "Medicamento:" +
                "nombre='" + nombre + '\'' +
                "; presentación=" + presentación +
                "; fechaVencimiento=" + fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Medicamento that)) return false;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
