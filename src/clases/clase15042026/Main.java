package clases.clase15042026;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Trabajador> personas = new ArrayList<>();
        Trabajador j=new Trabajador("Maldito",19,82.0f,153,300000);
        Trabajador j2=new Trabajador("Maldito2",18,87.0f,154,350000);
        personas.add(j);
        personas.add(j2);
        for (Trabajador p : personas) {
          p.mostrarDatos();
        }

    }
}
