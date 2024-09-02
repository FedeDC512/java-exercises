package geometria.figurepiane;

public class Quadrato extends Quadrilatero{
    private double lato;

    public Quadrato(double lato){
        this.lato = lato;
    }

    public double getLato(){
        return this.lato;
    }

    public double calcolaArea(){
        return lato * lato;
    }

    public void raddoppiaLato(){
        lato *= 2;
        System.out.println("Il lato del quadrato è correttamente raddoppiato. Lunghezza lato attuale: "+ lato +"cm");
    }

}
