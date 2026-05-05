package clases.EjercicioControl2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void main() {
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double sumaPuntajes = 0;
        Jugador a = new JugadorCasual("benb", "elb", TipoJugador.CASUAL, 100, 5);
        Jugador b = new JugadorCasual("beor", "elc", TipoJugador.CASUAL, 110, 6);
        Jugador c = new JugadorProfesional("tt", "t", TipoJugador.PROFESIONAL, 160, 11, "RAZER", 15);
        Jugador d = new JugadorProfesional("pp", "p", TipoJugador.PROFESIONAL, 190, 8, "HYPERX", 20);
        Jugador e = new Streamer("Lautaro", "LaCobraa", TipoJugador.STREAMER, 148, 100000, "KICK", "MCDONALS", 12);
        Jugador f = new Streamer("David", "Davo", TipoJugador.STREAMER, 149, 100001, "KICK", "BOCA", 12);
        jugadores.add(a);
        jugadores.add(b);
        jugadores.add(c);
        jugadores.add(d);
        jugadores.add(e);
        jugadores.add(f);
        System.out.println("===RONDA DEL TORNEO===");
        for (Jugador jugador : jugadores) {
            if (jugador instanceof JugadorCasual) {
                System.out.println(jugador.mostrarInfo());
                System.out.println("Puntaje:" + jugador.calcularPuntaje());
                System.out.println("Clasifica:" + jugador.puedeClasificar() + "|Categoria:" + jugador.getCategoria());
                sumaPuntajes = sumaPuntajes + jugador.calcularPuntaje();
            } else if (jugador instanceof JugadorProfesional) {
                System.out.println(jugador.mostrarInfo());
                System.out.println("Puntaje:" + jugador.calcularPuntaje());
                System.out.println("Clasifica:" + jugador.puedeClasificar() + "|Categoria:" + jugador.getCategoria());
                sumaPuntajes = sumaPuntajes + jugador.calcularPuntaje();
            } else if (jugador instanceof Streamer) {
                System.out.println(jugador.mostrarInfo());
                System.out.println("Puntaje:" + jugador.calcularPuntaje());
                System.out.println("Clasifica:" + jugador.puedeClasificar() + "|Categoria:" + jugador.getCategoria());
                sumaPuntajes = sumaPuntajes + jugador.calcularPuntaje();
            }
        }
        System.out.println("===JUGADORES PATROCINADOS===");
        for (Jugador jugador : jugadores) {
            if (jugador instanceof JugadorProfesional) {
                System.out.println(jugador.getAlias() + "--Patrocinador:" + ((JugadorProfesional) jugador).getNombrePatrocinador() + "| Bono:$" + ((JugadorProfesional) jugador).calcularBono());
            } else if (jugador instanceof Streamer) {
                System.out.println(jugador.getAlias() + "--Patrocinador:" + ((Streamer) jugador).getNombrePatrocinador() + "| Bono:$" + ((Streamer) jugador).calcularBono());
            }
        }
        System.out.println("=== PUNTAJE TOTAL DEL TORNEO: "+sumaPuntajes);
    }
}
