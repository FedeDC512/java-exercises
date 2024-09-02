import java.util.*;

class Persona{
    private int eta;
    private String nome, cognome;

    public int getEta(){
        return eta;
    }

    public String getNome(){
        return nome;
    }
    
    /*private static Comparator<Persona>
    etaComp = new Comparator<Persona>() { 
    @Override public int compare(Persona p1, Persona p2) {
    return p1.getEta() - p2.getEta();
    }
   }; */

   private static Comparator<Persona> etaComp = (p1, p2) -> p1.getEta() - p2.getEta();

   /*private static Comparator<Persona> 
    nomeComp = new Comparator<Persona>() {
    @Override public int compare(Persona p1, Persona p2) {
    String nome1 = p1.getNome();
    String nome2 = p2.getNome();
    return nome1.compareTo(nome2);
    }
   }; */

   private static Comparator<Persona> nomeComp = (p1, p2) -> p1.getNome().compareTo(p2.getNome());
   
   /*private static Comparator<Persona> nomeComp = (p1, p2) -> {
    String nome1 = p1.getNome();
    String nome2 = p2.getNome();
    return nome1.compareTo(nome2);
   };*/

   }
