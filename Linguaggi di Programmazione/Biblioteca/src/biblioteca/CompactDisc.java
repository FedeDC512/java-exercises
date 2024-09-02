package biblioteca;

import java.io.Serializable;
import java.util.Scanner;

public class CompactDisc extends Documento implements Serializable {

    protected String nome;
    protected double prezzo;
    protected double durata;
    protected int numeroCanzoni;


    public CompactDisc(){
        super();
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il nome: ");
        this.nome = scan.nextLine();
        System.out.print("Inserisci il numero di canzoni: ");
        this.numeroCanzoni = scan.nextInt();
        System.out.print("Inserisci la durata totale del cd: ");
        this.durata = scan.nextDouble();
        System.out.print("Inserisci il prezzo: ");
        this.prezzo = scan.nextDouble();
    }

    @Override
    public String getInfo(){
        return "CompactDisc";
    }

    @Override
    public String toString(){

        return "ID: "+super.ID+"\nTipo di documento: "+this.getInfo()+"\nNome: "+nome+"\nPrezzo: "+prezzo+"€\nNumero di canzoni: "+numeroCanzoni+"\nDurata totale: "+durata+"\n";
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
        return "";
    }
}
