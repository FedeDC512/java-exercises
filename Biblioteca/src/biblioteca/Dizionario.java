package biblioteca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Dizionario extends Documento implements Serializable {

    protected String argomento;
    protected double prezzo;
    protected String casa;
    protected int anno;
    protected ArrayList<Autore> autori = new ArrayList<>();

    public Dizionario(){
        super();
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci l'argomento: ");
        this.argomento = scan.nextLine();
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

        System.out.print("Inserisci l'anno di pubblicazione: ");
        this.anno = scan.nextInt();
    }

    @Override
    public String getInfo(){
        return "Dizionario";
    }

    @Override
    public String toString(){
        String stampautori = new String();
        for(Autore a : autori){
            stampautori += a + ", ";
        }

        return "ID: "+super.ID+"\nTipo di documento: "+this.getInfo()+"\nArgomento: "+argomento+"\nAutori/e: "+stampautori+"\nPrezzo: "+prezzo+"€\nCasa editrice: "+casa+"\nAnno di pubblicazione: "+anno+"\n";
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
