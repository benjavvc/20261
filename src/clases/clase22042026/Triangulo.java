package clases.clase22042026;

public class Triangulo extends Figura implements Dibujable {
    private int base;
    private int altura;
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public int calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujo un pinche triangulo");
    }
}
