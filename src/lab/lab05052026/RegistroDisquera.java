package lab.lab05052026;

import java.util.ArrayList;
import java.util.List;

public class RegistroDisquera {
    private static RegistroDisquera instance;
    List<String> nombreArtistas;
    public static RegistroDisquera getInstance(){
        if(instance == null){
            instance = new RegistroDisquera();
        }
        return instance;
    }
    private RegistroDisquera(){
        nombreArtistas = new ArrayList<>();
    }
    public void registrarArtista(String nombreArtista){
        nombreArtistas.add(nombreArtista);
    }
    public void mostrarArtistas(){
        for(String nombreArtista : nombreArtistas){
            System.out.println(nombreArtista);
        }
    }
}