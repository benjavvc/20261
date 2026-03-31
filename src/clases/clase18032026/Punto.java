package clases.clase18032026;

import java.util.Objects;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int distancia() {
        return Math.abs(this.x*x - this.y*y);
           }
    public void traslada(int desplX,int desplY){
       int disx=desplX+x;
       int disty=desplY+y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    @Override
    public String toString() {
        return "(" +  x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Punto punto)) return false;
        return x == punto.x && y == punto.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
