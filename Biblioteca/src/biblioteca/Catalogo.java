package biblioteca;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Catalogo implements Serializable {
    ArrayList<Documento> catalogo = new ArrayList<>();

    public ArrayList<Documento> getCatalogo(){
        return catalogo;
    }

    public void stampaCatalogo(){
        for(Documento l : catalogo){
            System.out.println(l);
        }
        if (catalogo.size() == 0){
            System.out.println("Il catalogo è vuoto");
        }
    }

    public void aggiungiDocumento(){
        Scanner scan = new Scanner(System.in);
        boolean a = true;
        while(a == true){
            catalogo.add(creaDocumento());
            System.out.println("Vuoi aggiungere altri documenti a questo catalogo? (true/false)");
            a = scan.nextBoolean();
        }
    }

    public void modificaDocumento(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci l'info del documento da modificare: ");
        String dacercare = scan.nextLine();
        for(int i = 0; i<catalogo.size() ; i++) {
            Documento l = catalogo.get(i);
            if((l.toString()).contains(dacercare)) {
                System.out.println(" --- "+l.getInfo()+" trovato! --- ");
                System.out.println(l);
                System.out.println("Vuoi sostituire questo "+l.getInfo()+"? (true/false)");
                boolean s = scan.nextBoolean();;
                if (s == true){
                    catalogo.set(i, creaDocumento());
                    System.out.println(" --- Documento modificato! --- ");
                    return;
                }
                else System.out.println("Continuo a cercare...");
            }
        }
        System.out.println("Non è stato modificato alcun documento");
    }

    public void cancellaDocumento(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci l'info del documento da cancellare: ");
        String dacercare = scan.nextLine();
        for(int i = 0; i<catalogo.size() ; i++) {
            Documento l = catalogo.get(i);
            if((l.toString()).contains(dacercare)) {
                System.out.println(" --- "+l.getInfo()+" trovato! --- ");
                System.out.println(l);
                System.out.println("Vuoi cancellare questo "+l.getInfo()+"? (true/false)");
                boolean s = scan.nextBoolean();
                if (s == true){
                    catalogo.remove(i);
                    System.out.println(" --- "+l.getInfo()+" cancellato! --- ");
                    return;
                }
                else System.out.println("Continuo a cercare...");
            }
        }
        System.out.println("Non è stato cancellato alcun documento");
    }

    public void ricerca(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci l'info del documento da cercare: ");
        String dacercare = scan.nextLine();
        for( Documento l : catalogo) {
            if((l.toString()).contains(dacercare)) {
                System.out.println(" --- "+l.getInfo()+" trovato! --- ");
                System.out.println(l);
            }
        }
    }

    private Documento creaDocumento(){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        while(a != -1) {
            System.out.println("Cosa vuoi aggiungere?\n" +
                    "(inserisci -1 per terminare)\n" +
                    "1) Libro\n" +
                    "2) Dizionario\n" +
                    "3) Quotidiano\n" +
                    "4) CompactDisc");
            a = scan.nextInt();
            if (a == 1) return new Libro();
            else if (a == 2) return new Dizionario();
            else if (a == 3) return new Quotidiano();
            else if (a == 4) return new CompactDisc();
            else System.out.println("Inserisci un numero valido!");
        }
        System.out.println("Non è stato inserito alcun documento");
        return null;
    }

    public void aggiungiPrestabile(){
        Scanner scan = new Scanner(System.in);
        boolean a = true;
        while(a == true){
            catalogo.add(creaPrestabile());
            System.out.println("Vuoi aggiungere altri documenti prestabili a questo catalogo? (true/false)");
            a = scan.nextBoolean();
        }
    }

    private Documento creaPrestabile(){
        Scanner scan = new Scanner(System.in);
        int a = 0;
        while(a != -1) {
            System.out.println("Hai scelto di aggiungere un documento prestabile!\nCosa vuoi aggiungere?\n" +
                    "(inserisci -1 per terminare)\n" +
                    "1) Libro prestabile\n" +
                    "2) Dizionario prestabile\n" +
                    "3) Quotidiano prestabile\n" +
                    "4) CompactDisc prestabile");
            a = scan.nextInt();
            if (a == 1) return new LibroPrestabile();
            else if (a == 2) return new DizionarioPrestabile();
            else if (a == 3) return new QuotidianoPrestabile();
            else if (a == 4) return new CompactDiscPrestabile();
            else System.out.println("Inserisci un numero valido!");
        }
        System.out.println("Non è stato inserito alcun documento prestabile");
        return null;
    }

    public void prendiPrestabile(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci l'info del documento che vuoi prendere in prestito: ");
        String dacercare = scan.nextLine();
        for(int i = 0; i<catalogo.size() ; i++) {
            Documento l = catalogo.get(i);
            if((l.toString()).contains(dacercare)) {
                System.out.println(" --- "+l.getInfo()+" trovato! --- ");
                System.out.println(l);
                System.out.println("Vuoi prendere in prestito questo "+l.getInfo()+"? (true/false)");
                boolean s = scan.nextBoolean();
                if (s == true){
                    System.out.println(catalogo.get(i).prendiPrestabile());
                    return;
                }
                else System.out.println("Continuo a cercare...");
            }
        }
        System.out.println("Non è stato preso in prestito alcun documento");
    }

    public void restituisciPrestabile(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci l'info del documento che vuoi restituire: ");
        String dacercare = scan.nextLine();
        for(int i = 0; i<catalogo.size() ; i++) {
            Documento l = catalogo.get(i);
            if((l.toString()).contains(dacercare)) {
                System.out.println(" --- "+l.getInfo()+" trovato! --- ");
                System.out.println(l);
                System.out.println("Vuoi restituire questo "+l.getInfo()+"? (true/false)");
                boolean s = scan.nextBoolean();
                if (s == true){
                    System.out.println(catalogo.get(i).restiPrestabile());
                    return;
                }
                else System.out.println("Continuo a cercare...");
            }
        }
        System.out.println("Non è stato restituito alcun documento");
    }

    public void ordinaCatalogo(){
        Comparator<Documento> documentiComp = new ComparaDocumenti();
        Collections.sort(catalogo, documentiComp);
        System.out.println("Il catalogo è stato correttamente ordinato secondo il cognome del primo autore");
    }

    public void salvaCatalogo() throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\fedea\\Documents\\Programmazione in Java\\Biblioteca\\src\\biblioteca.dat"));
        out.writeObject(catalogo);
        System.out.println("Hai correttamente salvato il catalogo in catalogo.dat");
    }

    public void caricaCatalogo() throws Exception{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\fedea\\Documents\\Programmazione in Java\\Biblioteca\\src\\biblioteca.dat"));
        catalogo = (ArrayList<Documento>) in.readObject();
        catalogo.get(0).assegnavalue(catalogo.size());
        System.out.println("Hai correttamente caricato il catalogo da catalogo.dat");
    }

}