package persone;

//import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creo un ArrayList di istanze di Persona diverse
        Persona p = new Persona("Mario", "Rossi");
        Studente s = new Studente("Federico", "Agnello", "Unipa", "12345");
        Impiegato i = new Impiegato("Antonino", "Noto", "Maria's Creations", 100);
        Dirigente d = new Dirigente("Maria", "Puccio", "Maria's Creations", 200, "Unghie");
        Persona[] personeDiverse = {p,s,i,d};
        /*ArrayList<Persona> personeDiverse = new ArrayList<Persona>();
        personeDiverse.add(p);
        personeDiverse.add(s);
        personeDiverse.add(i);
        personeDiverse.add(d);*/

        //creo un ArrayList di istanze di Persona uguali
        Persona p1 = new Persona("Mario", "Rossi");
        Persona s1 = new Studente("Federico", "Agnello", "Unipa", "12345");
        Persona i1 = new Impiegato("Antonino", "Noto", "Maria's Creations", 100);
        Persona d1 = new Dirigente("Maria", "Puccio", "Maria's Creations", 200, "Unghie");
        Persona[] personeVere = {p1,s1,i1,d1};
        /*ArrayList<Persona> personeVere = new ArrayList<Persona>();
        personeVere.add(p1);
        personeVere.add(s1);
        personeVere.add(i1);
        personeVere.add(d1);*/

        System.out.println("Stampo tipi di istanze diverse per Studente:");
        Persona p2 = s;
        s.presentati();
        p2.presentati();
        s1.presentati();
        System.out.println();

        System.out.println("\nStampo l'array personeDiverse e le rispettive classi a runtime:\n");
        for(Persona temp : personeDiverse){
            System.out.println("Classe: "+temp.getClass()+"\n"+temp);
        }
        System.out.println("\nStampo l'array di personeVere e le rispettive classi a runtime:\n");
        for(Persona temp : personeVere){
            System.out.println("Classe: "+temp.getClass()+"\n"+temp);
        }

        System.out.println("Richiamo il metodo presentati() per personeDiverse:");
        for (Persona temp : personeDiverse){
            temp.presentati();
        }
        System.out.println("\nRichiamo il metodo presentati() per personeVere:");
        for (Persona temp : personeVere){
            temp.presentati();
        }

    }
}
