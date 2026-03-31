package clases.clase17032026;

public class Cafe {
    private String nombre;
    private String tamaño;
    private double precio;
    private int cantidad;

    public Cafe(String nombre, String tamaño, double precio, int cantidad) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        cantidad++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public double getPrecio() {
        if (getTamaño().equalsIgnoreCase("Grande")) {
            precio = 2000;
        }else{
            precio = 1000;
        }
        return precio;
    }
    public void ticket(String nombre , double precio, int cantidad) {
        if (getNombre().equalsIgnoreCase(nombre)) {
            cantidad=cantidad;
        }
        precio = precio * cantidad;
        ticket(nombre , precio, cantidad);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
