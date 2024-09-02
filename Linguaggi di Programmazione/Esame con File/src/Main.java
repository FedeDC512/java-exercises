import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        try{
            System.out.println(parolaLunga(new File("C:\\Users\\fedea\\Documents\\Programmazione in Java\\Esame\\src\\testo.txt")));
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static String parolaLunga(File testo) throws FileNotFoundException {
    Scanner in = new Scanner(testo);
    String parolaMax = "";
    while(in.hasNext()){
        String parola = in.next();
        if(parolaMax.length() < parola.length()) {
            parolaMax = parola;
        }
    }
    return parolaMax;
    }

}
