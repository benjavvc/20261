package clases.clase22042026;

public class Rectangulo extends Figura implements Dibujable {
    @Override
    public void dibujar() {
        System.out.println("Dibujo un pinche Rectangulo");
    }

    private int base;
    private int altura;
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public int calcularArea() {
        return base*altura;
    }
}
