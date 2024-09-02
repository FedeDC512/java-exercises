package biblioteca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Quotidiano extends Documento implements Serializable {

    protected String nome;
    protected double prezzo;
    protected String casa;
    protected String cadenzaPubblicazione;
    protected ArrayList<Autore> autori = new ArrayList<>();

    public Quotidiano(){
        super();
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il nome: ");
        this.nome = scan.nextLine();
        System.out.print("Inserisci la casa editrice: ");
        this.casa = scan.nextLine();
        System.out.print("Inserisci la cadenza della pubblicazione: ");
        this.cadenzaPubblicazione = scan.nextLine();
        boolean a = true;
        while(a == true){
            autori.add(new Autore());
            System.out.println("Ci sono altri autori? (true/false)");
            a = scan.nextBoolean();
        }
        System.out.print("Inserisci il prezzo: ");
        this.prezzo = scan.nextDouble();
    }

    @Override
    public String getInfo(){
        return "Quotidiano";
    }

    @Override
    public String toString(){
        String stampautori = new String();
        for(Autore a : autori){
            stampautori += a + ", ";
        }

        return "ID: "+super.ID+"\nTipo di documento: "+this.getInfo()+"\nNome: "+nome+"\nAutori/e: "+stampautori+"\nPrezzo: "+prezzo+"€\nCasa editrice: "+casa+"\nCadenza di pubblicazione: "+cadenzaPubblicazione+"\n";
    }

    public String vediPrestabile(){
        return "Questo "+getInfo()+" non è prestabile!";
    }
    public String restiPrestabile(){
        return "Questo "+getInfo()+" non è prestabile!";
    }
    @Override
    public String prendiPrestabile() {
        return "Questo "+getInfo()+" non è prestabile!";
    }

    public String getCognome(){
        return autori.get(0).getCognome();
    }
}
