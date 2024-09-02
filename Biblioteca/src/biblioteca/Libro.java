package biblioteca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Libro extends Documento implements Serializable {
    protected String titolo;
    protected double prezzo;
    protected String casa;
    protected ArrayList<Autore> autori = new ArrayList<>();

    public Libro(){
        super();
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il titolo: ");
        this.titolo = scan.nextLine();
        System.out.print("Inserisci la casa editrice: ");
        this.casa = scan.nextLine();
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
        return "Libro";
    }

    @Override
    public String toString(){
        String stampautori = new String();
        for(Autore a : autori){
            stampautori += a + ", ";
        }
        //stampautori -= ", ";

        return "ID: "+super.ID+"\nTipo di documento: "+this.getInfo()+"\nTitolo: "+titolo+"\nAutori/e: "+stampautori+"\nPrezzo: "+prezzo+"€\nCasa editrice: "+casa+"\n";
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