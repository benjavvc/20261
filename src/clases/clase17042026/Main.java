package clases.clase17042026;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Animal> animals = new ArrayList<>();
        Animal a=new Persona(19,"Castaño");
        a.setNombre("Benjamín");
        a.setEstatura(180);
        a.setPeso(82);
        Gato b=new Gato("Quiltro","Marrones");
        b.setNombre("Gustavo");
        b.setEstatura(80);
        b.setPeso(6);
        Cerdo c=new Cerdo("Coihueco");
        Cerdo d=new Cerdo("Coihueco");
        c.setNombre("jorge");
        c.setPeso(80);
        c.setEstatura(92);
        d.setNombre("Pepa");
        d.setPeso(81);
        d.setEstatura(91);
        animals.add(a);
        animals.add(b);
        animals.add(c);
        animals.add(d);
        for(Animal a1:animals){
           if(a1 instanceof Cerdo){
               System.out.println("------CERDOS----");
               System.out.println( a1.mostrarDatos());
           }else if (a1 instanceof Gato){
               System.out.println("------GATOS----");
               System.out.println( a1.mostrarDatos());
           } else if (a1 instanceof Persona) {
               System.out.println("------PERSONAS----");
               System.out.println( a1.mostrarDatos());
           }
        }
    }
}
