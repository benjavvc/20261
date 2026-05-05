package lab.lab05052026;

public class Main {
    public static void main(String[] args) {
       RegistroDisquera departamentoMarketing=RegistroDisquera.getInstance();
       RegistroDisquera departamentoProduccion=RegistroDisquera.getInstance();
       departamentoMarketing.registrarArtista("Dua Lipa");
       departamentoProduccion.registrarArtista("The Weeknd");
       departamentoProduccion.registrarArtista("Rosalia");
       departamentoProduccion.mostrarArtistas();
       departamentoMarketing.mostrarArtistas();
        System.out.println(departamentoMarketing==departamentoProduccion);
    }
}
