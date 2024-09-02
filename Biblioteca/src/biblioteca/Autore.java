package biblioteca;

import java.io.Serializable;
import java.util.Scanner;

public class Autore implements Serializable  {
    private String nome;
    private String cognome;

    public Autore(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il nome dell'autore: ");
        this.nome = scan.nextLine();
        System.out.print("Inserisci il cognome dell'autore: ");
        this.cognome =scan.nextLine();
    }

    @Override
    public String toString(){
        return nome + " " + cognome;
    }

    public String getCognome(){
        return cognome;
    }
}
