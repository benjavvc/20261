package lab.lab14042026;

public class Gato extends Mascota{
    private boolean esDeInterior;

    public Gato(String nombre, int edad, boolean esDeInterior) {
        super(nombre, edad);
        this.esDeInterior = esDeInterior;
    }
    public void  hacerSonido(){
        super.hacerSonido();
        System.out.println("Miau");
    }
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Nombre: "+nombre+" Edad: "+edad+" Es De Interior: "+esDeInterior);
    }
}
