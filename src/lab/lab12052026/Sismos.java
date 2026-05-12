package lab.lab12052026;

public class Sismos {

    private String region;
    private String epicentro;
    private float magnitud;

    public Sismos(String region, String epicentro, float magnitud)
            throws SismoInavalidoException {
        setRegion(region);
        setEpicentro(epicentro);
        setMagnitud(magnitud);
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region)
            throws SismoInavalidoException {

        if(region.matches(".*\\d.*")) {

            throw new SismoInavalidoException(
                    "La región no puede contener números");
        }

        this.region = region;
    }

    public String getEpicentro() {
        return epicentro;
    }

    public void setEpicentro(String epicentro)
            throws SismoInavalidoException {

        if(epicentro.matches(".*\\d.*")) {

            throw new SismoInavalidoException(
                    "El epicentro no puede contener números");
        }

        this.epicentro = epicentro;
    }

    public float getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(float magnitud)
            throws SismoInavalidoException {

        if(magnitud < 0) {

            throw new SismoInavalidoException(
                    "La magnitud no puede ser negativa");
        }

        this.magnitud = magnitud;
    }
}