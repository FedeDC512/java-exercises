package biblioteca;

import java.io.Serializable;
import java.util.Scanner;

public class LibroPrestabile extends Libro implements Prestabile, Serializable {
        private boolean prestabilita;

        public LibroPrestabile(){
            super();
            rendiPrestabile();
        }

        @Override
        public void rendiPrestabile(){
            Scanner scan = new Scanner(System.in);
            System.out.println("In questo momento il libro è disponibile per il prestito? (true/false)");
            this.prestabilita = scan.nextBoolean();
        };

        @Override
        public String prendiPrestabile(){
            if(prestabilita == true){
                prestabilita = false;
                return "Hai preso in prestito questo libro";
            }
            else return "Libro già in prestito, aspetta che venga restituito!";
        };

        @Override
        public String vediPrestabile(){
            if(prestabilita == true){
                return "Questo libro è disponibile per il prestito";
            }
            else return "Questo libro è già in prestito";
        };

        @Override
        public String restiPrestabile(){
            if(prestabilita == false){
                prestabilita = true;
                return "Hai correttamente restituito questo libro";
            }
            else return "Il libro è già presente nel catalogo!";
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
