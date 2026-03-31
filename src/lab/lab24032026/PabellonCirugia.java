package lab.lab24032026;

import java.util.Objects;

public class PabellonCirugia {
    private int numero;
    private String especialidad;
    private Estado estado;

    public PabellonCirugia(int numero, String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;
        estado = Estado.DISPONIBLE;
    }

    public int getNumero() {
        return numero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public String toString() {
        return numero + " ; " + especialidad + " ; " + estado;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PabellonCirugia that)) return false;
        return numero == that.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(numero);
    }
}
