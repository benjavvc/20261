package lab.lab14042026;

public class Main {
    public static void main(String[] args) {
        Perro p=new Perro("Bastian",19,"Pastor");
        p.mostrarInfo();
        p.hacerSonido();
        Gato g=new Gato("Gustavo",3,true);
        g.mostrarInfo();
        g.hacerSonido();
        Gato g2=new Gato("Carbón",3,false);
        g2.mostrarInfo();
        g2.hacerSonido();
    }
}
