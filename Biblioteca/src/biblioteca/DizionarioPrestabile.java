package biblioteca;

import java.io.Serializable;
import java.util.Scanner;

public class DizionarioPrestabile extends Dizionario implements Prestabile, Serializable {
    private boolean prestabilita;

    public DizionarioPrestabile(){
        super();
        rendiPrestabile();
    }

    @Override
    public void rendiPrestabile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("In questo momento il dizionario è disponibile per il prestito? (true/false)");
        this.prestabilita = scan.nextBoolean();
    };

    @Override
    public String prendiPrestabile(){
        if(prestabilita == true){
            prestabilita = false;
            return "Hai preso in prestito questo dizionario";
        }
        else return "Dizionario già in prestito, aspetta che venga restituito!";
    };

    @Override
    public String vediPrestabile(){
        if(prestabilita == true){
            return "Questo dizionario è disponibile per il prestito";
        }
        else return "Questo dizionario è già in prestito";
    };

    @Override
    public String restiPrestabile(){
        if(prestabilita == false){
            prestabilita = true;
            return "Hai correttamente restituito questo dizionario";
        }
        else return "Il dizionario è già presente nel catalogo!";
    };

    @Override
    public Boolean getPrestabile(){
        return prestabilita;
    }

    @Override
    public void modificaPrestabilita(){

    }

    @Override
    public String toString(){
        return super.toString() + vediPrestabile()+"\n";
    }
}