package clases.clase17042026;

public abstract class Animal {
    protected String nombre;
    protected int peso;
    protected int estatura;

    public Animal() {
        peso=0;
        estatura=0;
        nombre="UNKNOWM";
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String mostrarDatos(){
        return "Nombre:"+getNombre()+
                "\nPeso:"+getPeso()+
                "\nEstatura:"+getEstatura();
    }
}
