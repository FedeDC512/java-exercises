package geometria.figuresolide;

import geometria.figurepiane.Quadrato;

public class Cubo {
    Quadrato q1;

    public Cubo(int spigolo){
        q1 = new Quadrato(spigolo);
    }

    public double getSpigolo(){
        return q1.getLato();
    }

    public double calcolaAreaFaccia(){
        return q1.calcolaArea();
    }

    public double calcolaArea(){
        return q1.calcolaArea() * q1.calcolaArea();
    }
}
