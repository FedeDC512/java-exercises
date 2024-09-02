import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Set<Integer> s1 = new HashSet<Integer>();
        System.out.println("La collezione set è vuota: "+s1.isEmpty());
        for (int i = 20; i>11;i--){
            s1.add(i);
        }

        System.out.println("La collezione set è vuota: "+s1.isEmpty());
        System.out.println("La collezione contiene 1: "+s1.contains(1));
        stampa(s1);
        System.out.println("La collezione contiene due numeri consecutivi fra -10 e 10: "+consecutivi(s1));
        System.out.println("La collezione contiene due numeri consecutivi: "+consecutivi2(s1));
        System.out.println("La collezione contiene due numeri consecutivi (con iteratore): "+consecutivi2iter(s1));
        eliminaPari(s1);
        System.out.print("I numeri pari sono stati rimossi dalla collezione: ");
        stampa(s1);

        Set<Punto> s2 = new HashSet<Punto>();
        creaSetPunti(s2);
        System.out.println("\nCreata una collezione di Punti randomici");
        stampaPunti(s2);
        stampaPrimoQuadrante(s2);

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i<6;i++){
            al.add(i);
        }
        System.out.println("\nArrayList creato: "+al);
        selezionaPariList(al);
        //eliminaDuplicatiList(al);
        System.out.println("Duplicati eliminati con ListIterator: "+al);

    }

    static void stampa(Set <Integer> s){
        for (int i : s){
            System.out.print(i+", ");
        }
        System.out.println();
    }

    static boolean consecutivi(Set <Integer> s){
        Set<Integer> verifica = new HashSet<Integer>();

        verifica.add(-10);
        for (int i = -10; i<10;i++){
            verifica.add(i+1);
            if(s.containsAll(verifica)) return true;
            verifica.remove(i);
        }
    return false;
    }

    static boolean consecutivi2(Set<Integer> s){
        for (int i : s){
            if (s.contains(i+1)) return true;
        }
    return false;
    }

    static boolean consecutivi2iter(Set<Integer> s){
        Iterator<?> i = s.iterator(), j = s.iterator();
	    while( i.hasNext() ){
            int v1 = (int) i.next();
            while( j.hasNext() ){
                int v2 = (int) j.next();
                if (v1 == (v2+1)) return true;
            }
            j = s.iterator();
        }
        return false;
    }

    static void eliminaPari(Set<Integer> s){
        ArrayList<Integer> e = new ArrayList<Integer>();
        for (int i : s){
            if (i%2 == 0) e.add(i);
        }

        for (int i : e){
            s.remove(i);
        }
    }

    static int random(){
        int max = 10;
        int min = -10;
        int range = max - min + 1;

        int rand = (int)(Math.random() * range) + min;

        return rand;
    }

    static void creaSetPunti(Set<Punto> p){
        for (int i = 0; i < 10; i++) {
            p.add(new Punto(random(), random()));
        }
    }

    static void stampaPunti(Set<Punto> p){
        for(Punto s : p){
            System.out.print("("+s.getX()+", "+s.getY()+"), ");
        }
        System.out.println();
    }

    static void stampaPrimoQuadrante(Set<Punto> p){
        Set<Punto> s = new HashSet<Punto>();
        for(Punto t : p){
            if(t.getX() >= 0 && t.getY() >= 0)s.add(t);
        }
        System.out.print("Punti nel primo quadrante: ");
        stampaPunti(s);
    }

    static void selezionaPariList (List<Integer> l){
        System.out.print("Stampa i pari con ListIterator: ");
        ArrayList<Integer> stampa = new ArrayList<Integer>();
        ListIterator<Integer> i = l.listIterator();
	    while( i.hasNext() ){
            if(i.next()%2 == 0){
                i.previous();
                System.out.print(i.next()+", ");
            }
        }
        System.out.println();
    }

    /* 
    static void eliminaDuplicatiList (List<Integer> l){
        ListIterator<Integer> li = l.listIterator();
        ArrayList<Integer> e = new ArrayList<Integer>();

        for(int i : l){
            while( li.hasNext() ){
                if(li.next() == i ){
                    e.add(i);
                }
            }
        }
    }
    */
}
