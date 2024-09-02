import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String path = "C:/Users/Federico/Documents/Esercizi in Java/File/input.txt";
        LetturaScrittura(path);

        SalvaUtente();

        InfoFile(path);

        NewFileTab(path);
    }

    public static void LetturaScrittura(String path) throws Exception {
        File f = new File(path);
        System.out.println("Stampa a schermo con Scanner, lettura riga per riga:");
        if (f.exists()){
            Scanner in = new Scanner(f);
            while (in.hasNextLine()){
                System.out.println(in.nextLine());
            }
            in.close();
        }

        BufferedReader inLine = new BufferedReader(new FileReader(path));
        System.out.println("\nStampa a schermo con BufferedReader, lettura riga per riga:");
        String l;
        while((l=inLine.readLine()) != null){
            System.out.println(l);
        }
        inLine.close();
        
        BufferedReader inChar = new BufferedReader(new FileReader(path));
        System.out.println("\nStampa a schermo con BufferedReader, lettura carattere per carattere:");
        int c;
        while((c=inChar.read()) != -1){
            System.out.print((char)c);
        }
        inChar.close();

        BufferedReader in = new BufferedReader(new FileReader(path));
        PrintWriter out = new PrintWriter(new FileWriter("outChar.txt"));
        while((c=in.read()) != -1){
            out.print((char)c);
        }
        System.out.println("\n\nHo copiato il file input.txt in outChar, carattere per carattere.");
		in.close();
        out.close();

        BufferedReader in2 = new BufferedReader(new FileReader(path));
        PrintWriter out2 = new PrintWriter(new FileWriter("outLine.txt"));
        while((l=in2.readLine()) != null){
            out2.println(l);
        }
        System.out.println("\nHo copiato il file input.txt in outLine, riga per riga.");
		in2.close();
        out2.close();
    }

    public static void SalvaUtente() throws IOException{

        BufferedInputStream in = new BufferedInputStream(System.in);
        PrintWriter out = new PrintWriter(new FileWriter("utente.txt"));
        System.out.println("Inserisci 10 caratteri: ");
        for(int k=0; k<10 ; k++){
            int i=in.read();
            out.print((char)i);
        }
        System.out.println("I 10 caratteri sono stati salvati");
        in.close();
        out.close();
        
        /* BufferedReader in2 = new BufferedReader(new FileReader(path));
        PrintWriter out2 = new PrintWriter(new FileWriter("outLine.txt"));
        while((l=in2.readLine()) != null){
            out2.println(l);
        }
        System.out.println("\nHo copiato il file input.txt in outLine, riga per riga.");
		in2.close();
        out2.close();*/

    }

    public static void InfoFile(String path) throws Exception {
        int numeroRighe=0, numeroParole=0, numeroCaratteri=0;

        BufferedReader in = new BufferedReader(new FileReader(path));
        int i;
        while((i=in.read()) != -1){
            if(Character.isLetter(i)) numeroCaratteri++;
            else if (i==' ') numeroParole++;
            else if (i=='\n') {
                numeroRighe++;
                numeroParole++;
            }

        }
        numeroParole++;
        numeroRighe++;
        in.close();

        System.out.println("Il file possiede "+numeroRighe+" righe, "+numeroParole+" parole e "+numeroCaratteri+" caratteri alfabetici");
    }

    public static void NewFileTab(String path) throws Exception {
        BufferedReader in = new BufferedReader(new FileReader(path));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        String l;
        int count = 0;
        while((l=in.readLine()) != null){
            out.print(count+"\t");
            count++;
            out.println(l);
        }
        in.close();
        out.close();

        System.out.println("Il file copiato, aggiuti numeri e tabulazioni");

    }
}
