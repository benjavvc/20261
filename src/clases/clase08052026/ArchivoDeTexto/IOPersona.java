package clases.clase08052026.ArchivoDeTexto;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class IOPersona {
        private static IOPersona instance;
        private IOPersona() {

        }
        public static IOPersona getInstance() {
            if (instance == null) {
                instance = new IOPersona();
            }
            return instance;
        }
        public void savePersonas(Persona[] personas)throws FileNotFoundException {
            PrintStream archPersonas=new  PrintStream(new File("Personas.txt"));
            for(Persona p: personas) {
                archPersonas.println(p.toString());
            }
            archPersonas.close();
        }
        public Persona[] readPersonas() throws FileNotFoundException {
            Scanner archPersonas=new Scanner(new File("Personas.txt"));
            ArrayList<Persona> personas=new ArrayList<>();
            String nombre;
            String direccion;
            LocalDate fechaNacimiento;
            EstadoCivil estadoCivil;
            float estatura;

            archPersonas.useDelimiter("\r\n|; ");
            archPersonas.useLocale(Locale.UK);
            while(archPersonas.hasNext()) {

                nombre=archPersonas.next();
                direccion=archPersonas.next();
                fechaNacimiento=LocalDate.parse(archPersonas.next());
                estadoCivil=EstadoCivil.valueOf(archPersonas.next());
                estatura=Float.parseFloat(archPersonas.next());
                personas.add(new Persona(nombre,direccion,fechaNacimiento,estadoCivil,estatura));
            }
            archPersonas.close();
            return personas.toArray(new Persona[0]);
        }
}
