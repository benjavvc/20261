package clases.clase08052026.ArchivoDeTexto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static void main(String[] args) {
        Persona p=new Persona("Benjamin","Miraflores,Coihueco",LocalDate.of(2007,02,21),EstadoCivil.SOLTERO,1.80f );
    }
}
