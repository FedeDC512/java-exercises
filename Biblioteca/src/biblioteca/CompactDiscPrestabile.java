package biblioteca;

import java.io.Serializable;
import java.util.Scanner;

public class CompactDiscPrestabile extends CompactDisc implements Prestabile, Serializable {
    private boolean prestabilita;

    public CompactDiscPrestabile(){
        super();
        rendiPrestabile();
    }

    @Override
    public void rendiPrestabile(){
        Scanner scan = new Scanner(System.in);
        System.out.println("In questo momento il cd è disponibile per il prestito? (true/false)");
        this.prestabilita = scan.nextBoolean();
    };

    @Override
    public String prendiPrestabile(){
        if(prestabilita == true){
            prestabilita = false;
            return "Hai preso in prestito questo cd";
        }
        else return "Cd già in prestito, aspetta che venga restituito!";
    };

    @Override
    public String vediPrestabile(){
        if(prestabilita == true){
            return "Questo cd è disponibile per il prestito";
        }
        else return "Questo cd è già in prestito";
    };

    @Override
    public String restiPrestabile(){
        if(prestabilita == false){
            prestabilita = true;
            return "Hai correttamente restituito questo cd";
        }
        else return "Il cd è già presente nel catalogo!";
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
