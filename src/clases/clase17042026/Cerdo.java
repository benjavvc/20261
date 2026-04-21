package clases.clase17042026;

public class Cerdo extends Animal {
    private String lugarDeOrigen;

    public Cerdo( String lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }
    public String getLugarDeOrigen() {
        return lugarDeOrigen;
    }
    public void setLugarDeOrigen(String lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }

    @Override
    public String mostrarDatos() {
        String ss = super.mostrarDatos();
        System.out.println("Lugar de origen: " + getLugarDeOrigen());
        return ss;
    }
}
