package clases.clase17042026;

public class Gato extends Animal {
    private String raza;
    private String colorDeOjos;

    public Gato(String raza, String colorDeOjos) {
        this.raza = raza;
        this.colorDeOjos = colorDeOjos;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getColorDeOjos() {
        return colorDeOjos;
    }
    public void setColorDeOjos(String colorDeOjos) {
        this.colorDeOjos = colorDeOjos;
    }

    @Override
    public String mostrarDatos() {
        String ss = super.mostrarDatos();
        System.out.println("Raza: " + getRaza());
        System.out.println("Color de Ojos: " + getColorDeOjos());
        return ss;
    }
}
