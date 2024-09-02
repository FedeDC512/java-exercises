package geometria.figurepiane;

public class Cerchio {
    private double raggio;
    public static final double PI_GRECO = 3.14;

    public Cerchio(double raggio){
        this.raggio = raggio;
    }

    public double getRaggio(){
        return this.raggio;
    }

    public double calcolaArea(){
        return PI_GRECO * raggio * raggio;
    }
}
