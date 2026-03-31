package lab.lab30032026;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Vehiculo {
    private static String marca="Cadilacc";
    private Categoria categoria;
    private int peso;
    private String color;
    private int potenciaMaxima;
    private LocalDate fechaPrimeraCarrera;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Vehiculo( int peso, String color, int potenciaMaxima) {
        this.peso = peso;
        this.color = color;
        this.potenciaMaxima = potenciaMaxima;
    }
    public static String setMarca(String marca) {
        Vehiculo.marca=marca;
        return marca;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public int getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    public int getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public LocalDate getFechaPrimeraCarrera() {
        return fechaPrimeraCarrera;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPotenciaMaxima(int potenciaMaxima) {
        this.potenciaMaxima = potenciaMaxima;
    }

    public void setFechaPrimeraCarrera(LocalDate fechaPrimeraCarrera) {
      if (Categoria.F1.equals(this.categoria)) {
          fechaPrimeraCarrera = LocalDate.of(2026,05,15);
      }if (Categoria.IMSA.equals(this.categoria)) {
          fechaPrimeraCarrera = LocalDate.of(2026,05,2);
        }if (Categoria.IMSA.equals(this.categoria)) {
          fechaPrimeraCarrera = LocalDate.of(2026,06,1);
        }
    }
    public int RestanteCarrera(){
        long diasRestante= ChronoUnit.DAYS.between(fechaPrimeraCarrera, LocalDate.now());
        return diasRestante <= 0 ? 0:(int)diasRestante;
    }
    public static void ModificarMarca(String nuevaMarca){
        marca=nuevaMarca;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Vehiculo vehiculo)) return false;
        return peso == vehiculo.peso;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(peso);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +marca+","+
                "categoria=" + categoria +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", potenciaMaxima=" + potenciaMaxima +
                ", fechaPrimeraCarrera=" + fechaPrimeraCarrera +
                ", formatter=" + formatter +
                '}';
    }
}
