package lab.lab21042026;

public class GranTurismo extends CocheDeCarreras{
    public int pesoExtraLastre;
    public GranTurismo(String marca, String modelo, int velocidad,int pesoExtraLastre){
        super(marca, modelo, velocidad);
        this.pesoExtraLastre = pesoExtraLastre;
    }

    public int getPesoExtraLastre() {
        return pesoExtraLastre;
    }

    public void setPesoExtraLastre(int pesoExtraLastre) {
        this.pesoExtraLastre = pesoExtraLastre;
    }

    @Override
    public void competir() {
        if(this.pesoExtraLastre<145){
            System.out.println("El piloto gestiona muy bien el peso");
        }else  if(this.pesoExtraLastre>145){
            System.out.println("El piloto no gestiona bien el peso");
        }
    }

    @Override
    public String mostrarDatos() {
        String tt=super.mostrarDatos();
        competir();
        return tt;
    }
}
