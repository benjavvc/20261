package lab.lab21042026;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CocheDeCarreras> coches=new ArrayList<>();
        CocheDeCarreras a=new GranTurismo("ford","Mustang",350,135);
        coches.add(a);
        CocheDeCarreras b=new PrototipoLM("ford","Maverick",200,true);
        coches.add(b);
        CocheDeCarreras f=new PrototipoLM("Chevrolet","Spark",200,false);
        coches.add(f);
        CocheDeCarreras d=new GranTurismo("Chevrolet","Camaro",345,146);
        coches.add(d);
        for(CocheDeCarreras c:coches){
            if (c instanceof GranTurismo){
                System.out.println("----GranTurismo----");
                c.mostrarDatos();
            }else if (c instanceof PrototipoLM){
                System.out.println("----PrototipoLM----");
                c.mostrarDatos();
            }
        }
    }
}
