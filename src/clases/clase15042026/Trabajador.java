package clases.clase15042026;

public class Trabajador extends Persona {
    private int codigoTrabajador;
    private int sueldo;
    public Trabajador(String nombre, int edad, float peso, int codigoTrabajador, int sueldo) {
        super(nombre, edad, peso);
        this.codigoTrabajador = codigoTrabajador;
        this.sueldo = sueldo;
    }
    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public int getSueldo() {
        return sueldo;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public float getPeso() {
        return peso;
    }
    public void mostrarDatos(){
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Codigo de trabajador: " + codigoTrabajador);
    }
}
