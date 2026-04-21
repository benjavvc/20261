package clases.clase17042026;

public class Persona extends Animal {
    private int edad;
    private String colorDePelo;

    public Persona( int edad, String colorDePelo) {
        this.edad = edad;
        this.colorDePelo = colorDePelo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    @Override
    public String mostrarDatos() {
        String ss = super.mostrarDatos();
        System.out.println("Edad: " + getEdad());
        System.out.println("Color de Pelo: " + getColorDePelo());
        return ss;
    }
}
