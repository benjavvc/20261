package clases.Practico11052026;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
       setEdad(edad);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad)throws EdadInvalidaException {
        if(edad<0){
            throw new EdadInvalidaException("La edad debe ser mayor a 0");
        }
        if(edad>120){
            throw new EdadInvalidaException("La edad debe ser menor a 120");
        }
        this.edad = edad;
    }
    public String toString(){
        return "Nombre del usuario: " + this.nombre + " Edad: " + this.edad;
    }
}
