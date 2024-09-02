import geometria.figurepiane.*;
import geometria.figuresolide.*;

public class Main {
    public static void main (String[] args) {
        Cerchio c1 = new Cerchio(5);
        System.out.println("Il PI_GRECO è impostato a "+ Cerchio.PI_GRECO);
        System.out.println("Il cerchio c1 ha il raggio di "+ c1.getRaggio() +"cm");
        System.out.println("L'area del cerchio c1 è "+ c1.calcolaArea() +"cm\u00B2");
        System.out.println();

        Quadrato q1 = new Quadrato(5);
        System.out.println("Il quadrato q1 ha il lato di "+ q1.getLato() +"cm");
        System.out.println("L'area del quadrato q1 è "+ q1.calcolaArea() +"cm\u00B2");
        System.out.println();

        q1.raddoppiaLato();
        System.out.println("Il quadrato q1 ha il lato di "+ q1.getLato() +"cm");
        System.out.println("L'area del quadrato q1 è "+ q1.calcolaArea() +"cm\u00B2");
        System.out.println();

        Cubo r1 = new Cubo(5);
        System.out.println("Il cubo r1 ha lo spigolo di "+ r1.getSpigolo() +"cm");
        System.out.println("La faccia del cubo r1 è "+ r1.calcolaAreaFaccia() +"cm\u00B2");
        System.out.println("L'area del cubo r1 è "+ r1.calcolaArea() +"cm\u00B3");
    }
}
