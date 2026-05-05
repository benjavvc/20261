package clases.EjercicioControl2;

public class JugadorCasual extends Jugador {
    private int horasJugadas;
    public JugadorCasual(String nombre, String alias, TipoJugador tipo, double puntajeBase,int horasJugadas) {
        super(nombre, alias, tipo, puntajeBase);
        this.horasJugadas = horasJugadas;
    }
    public int getHorasJugadas() {
        return horasJugadas;
    }
    public void setHorasJugadas(int horasJugadas) {
        this.horasJugadas = horasJugadas;
    }

    @Override
    public double calcularPuntaje() {
        return getPuntajeBase()+(horasJugadas*0.5);
    }

    @Override
    public boolean puedeClasificar() {
        if (calcularPuntaje()>100){
            return true;
        }
        return false;
    }

    @Override
    public String getCategoria() {
       if(calcularPuntaje()<80){
           return "Principiante";
       }else if(calcularPuntaje()<=100||calcularPuntaje()>=80){
           return "Intermedio";
       }else if(calcularPuntaje()>100){
           return "Avanzado";
       }
       return "";
    }
}
