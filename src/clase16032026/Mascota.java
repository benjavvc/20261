package clase16032026;

public class Mascota {
    private String nombre;
    private String especie;
    private boolean estado;
    public Mascota(String nombre, boolean estado, String especie) {
        this.nombre = nombre;
        this.especie = especie;
        this.estado = false;
    }
    public boolean getEstado() {
      return  this.estado;
    }
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEspecie(String especie) {
        this.especie = especie;
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Especie: " + especie;
    }
}
