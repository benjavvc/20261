package clases.claseEjercicio215042026;

import java.util.ArrayList;

public class Cliente {
    private String rut;
    private String nombre;
    private String direccion;
    ArrayList<CuentaBancaria> cuentas = new ArrayList<CuentaBancaria>();
    public Cliente(String rut, String nombre) {
        this.rut=rut;
        this.nombre=nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
