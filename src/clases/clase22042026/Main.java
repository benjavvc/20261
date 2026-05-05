package clases.clase22042026;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Figura> figuras = new ArrayList<>();
        Figura figura=new Circulo(25);
        Figura figura2=new Rectangulo(25,25);
        Figura figura3=new Triangulo(25,25);
        figuras.add(figura);
        figuras.add(figura2);
        figuras.add(figura3);
        for (Figura figura1 : figuras) {
            if(figura1 instanceof Circulo){
                Circulo circulo = (Circulo) figura1;
                System.out.println("Area circulo:"+figura1.calcularArea());
                ((Circulo) figura1).dibujar();
            }
            if(figura1 instanceof Rectangulo){
                Rectangulo rectangulo = (Rectangulo) figura1;
                System.out.println("Area rectangulo:"+figura1.calcularArea());
                ((Rectangulo) figura1).dibujar();
            }
            if(figura1 instanceof Triangulo){
                Triangulo triangulo = (Triangulo) figura1;
                System.out.println("Area triangulo:"+figura1.calcularArea());
                ((Triangulo) figura1).dibujar();

            }
        }
    }
}
