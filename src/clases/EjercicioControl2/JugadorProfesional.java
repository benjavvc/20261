package clases.EjercicioControl2;

public class JugadorProfesional extends Jugador implements Patrocinado {

    private int ranking;
    private String nombrePatocinador;
    private double porcentajeBono;

    public JugadorProfesional(String nombre, String alias, TipoJugador tipo, double puntajeBase,int ranking,String nombrePatocinador,double calcularBono) {
        super(nombre, alias, tipo, puntajeBase);
        this.ranking = ranking;
        this.nombrePatocinador = nombrePatocinador;
        this.porcentajeBono = calcularBono;
    }
    public int getRanking() {
        return ranking;
    }
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public double getPorcentajeBono() {
        return porcentajeBono;
    }

    public void setPorcentajeBono(double porcentajeBono) {
        this.porcentajeBono = porcentajeBono;
    }

    @Override
    public double calcularPuntaje() {
        return getPuntajeBase()*(1.0+1.0/ranking);
    }

    @Override
    public boolean puedeClasificar() {
        return true;
    }

    @Override
    public String getCategoria() {
        if (ranking <= 10){
            return "Pro";
        }else if (ranking <= 50){
            return "Semipro";
        }else{
            return "Amateur";
        }
    }
    @Override
    public String getNombrePatrocinador() {
        return nombrePatocinador;
    }

    @Override
    public double calcularBono() {
        return calcularPuntaje()*porcentajeBono/100;
    }
}
