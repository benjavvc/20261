package clases.EjercicioControl2;

public class Streamer extends Jugador implements Patrocinado {
    private int seguidores;
    private String plataforma;
    private String nombrePatrocinador;
    private double porcentajeBono;
    public Streamer(String nombre, String alias, TipoJugador tipo, double puntajeBase,int seguidores, String plataforma, String nombrePatrocinador, double porcentajeBono) {
        super(nombre, alias, tipo, puntajeBase);
        this.seguidores = seguidores;
        this.plataforma = plataforma;
        this.nombrePatrocinador = nombrePatrocinador;
        this.porcentajeBono = porcentajeBono;
    }

    public int getSeguidores() {
        return seguidores;
    }

    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }

    @Override
    public double calcularPuntaje() {
        return getPuntajeBase()+(seguidores/100);
    }

    @Override
    public boolean puedeClasificar() {
        if(calcularPuntaje()>150){
            return true;
        }
        return false;
    }

    @Override
    public String getCategoria() {
        if(seguidores<10.000){
            return"Nano";
        }else if(seguidores<100.000){
            return"Micro";
        }else{
            return"Macro";
        }
    }

    @Override
    public String getNombrePatrocinador() {
        return nombrePatrocinador;
    }

    @Override
    public double calcularBono() {
        return calcularPuntaje()*porcentajeBono/100;
    }
}
