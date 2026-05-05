package clases.clase22042026;

public class Circulo extends Figura implements  Dibujable{
    private int radio;
    private double diametro;

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public int calcularArea() {
        return (int)Math.PI*radio*radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo un pinche Circulo");
    }
}
