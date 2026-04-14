package lab.lab14042026;

public class Perro extends Mascota {
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    @Override
    public void hacerSonido() {
        super.hacerSonido();
        System.out.println("gouf");
    }
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("raza: "+raza+" Nombre: "+nombre+" Edad: "+edad);
    }
}
