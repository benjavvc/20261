package clases.EjercicioControl2;

public abstract class Jugador implements Puntuable,Clasificable {
    private String nombre,alias;
    private TipoJugador tipo;
    private double puntajeBase, premio;

    public Jugador(String nombre, String alias, TipoJugador tipo, double puntajeBase) {
        this.nombre = nombre;
        this.alias = alias;
        this.tipo = tipo;
        this.puntajeBase = puntajeBase;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getAlias() {
        return alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public TipoJugador getTipo() {
        return tipo;
    }
    public void setTipo(TipoJugador tipo) {
        this.tipo = tipo;
    }
    public double getPuntajeBase() {
        return puntajeBase;
    }
    public void setPuntajeBase(double puntajeBase) {
        this.puntajeBase = puntajeBase;
    }
    public double getPremio() {
        return premio;
    }
    public void setPremio(double premio) {
        this.premio = premio;
    }
    public String mostrarInfo(){
        return "Nombre:"+nombre + "|Alias: " + alias + "|Tipo:" + tipo + "|Puntaje base: " + puntajeBase;
    }
    public double calcularPremio(){
        return premio;
    }
    public abstract double calcularPuntaje();
    public void mostrarPuntaje(){
        System.out.println("Puntaje:"+calcularPuntaje());
    }
    public abstract boolean puedeClasificar();
    public abstract String getCategoria();

}
