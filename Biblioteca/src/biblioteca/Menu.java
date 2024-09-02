package biblioteca;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void start(Catalogo cat) throws Exception{
        Scanner scan = new Scanner(System.in);
        int a = 0;
        while(a != -1) {
            System.out.println("Benvenuto nella Biblioteca, cosa vuoi fare?\n" +
                    "(inserisci -1 per terminare)\n" +
                    "1) Stampare il catalogo\n" +
                    "2) Inserire un documento\n" +
                    "3) Inserire un documento prestabile\n" +
                    "4) Modifica un documento\n" +
                    "5) Cancella un documento\n" +
                    "6) Prendi in prestito un documento prestabile\n" +
                    "7) Restituisci un documento prestabile\n" +
                    "8) Ricercare un libro per info\n" +
                    "9) Ordina il catalogo per cognome dell'autore\n" +
                    "10) Salva il catalogo su un file\n"+
                    "11) Carica il catalogo da file\n");
            a = scan.nextInt();
            if (a == -1) return;
            else if(a == 1) cat.stampaCatalogo();
            else if(a == 2) cat.aggiungiDocumento();
            else if(a == 3) cat.aggiungiPrestabile();
            else if(a == 4) cat.modificaDocumento();
            else if(a == 5) cat.cancellaDocumento();
            else if(a == 6) cat.prendiPrestabile();
            else if(a == 7) cat.restituisciPrestabile();
            else if(a == 8) cat.ricerca();
            else if(a == 9) cat.ordinaCatalogo();
            else if(a == 10) cat.salvaCatalogo();
            else if(a == 11) cat.caricaCatalogo();
            else System.out.println("Inserisci un numero valido!");
        }
    }
}
