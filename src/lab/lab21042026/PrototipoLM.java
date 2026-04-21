package lab.lab21042026;

public class PrototipoLM extends CocheDeCarreras{
public boolean sistemaHibrido;
    public PrototipoLM(String marca, String modelo, int velocidad,boolean sistemaHibrido) {
        super(marca, modelo, velocidad);
        this.sistemaHibrido = sistemaHibrido;
    }

    public boolean isSistemaHibrido() {
        return sistemaHibrido;
    }
    public void setSistemaHibrido(boolean sistemaHibrido) {
        this.sistemaHibrido = sistemaHibrido;
    }

    @Override
    public void competir() {
        if (isSistemaHibrido()) {
            sistemaHibrido=true;
        }else {
            sistemaHibrido=false;
        }
    }

    @Override
    public String mostrarDatos() {
        String tt=super.mostrarDatos();
        System.out.println("El vehiculo es hibrido: "+isSistemaHibrido());
        return tt;
    }
}
