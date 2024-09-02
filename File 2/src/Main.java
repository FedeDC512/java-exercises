import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader leggo = new BufferedReader(new FileReader("C:\\Users\\fedea\\Documents\\Programmazione in Java\\File\\src\\ciao.txt"));
        FileReader leggo2 = new FileReader("C:\\Users\\fedea\\Documents\\Programmazione in Java\\File\\src\\ciao.txt");

        PrintWriter scrivo = new PrintWriter(new FileWriter("C:\\Users\\fedea\\Documents\\Programmazione in Java\\File\\src\\righeciao.txt"));
        FileWriter scrivo2 = new FileWriter("C:\\Users\\fedea\\Documents\\Programmazione in Java\\File\\src\\intciao.txt");

        String l;
        int c;

        System.out.println("Stampo e salvo con BufferedReader:");
        while ((l = leggo.readLine()) != null) {
            System.out.println(l);
            scrivo.println(l);
        }

        System.out.println("\nStampo con FileReader:");
        while ((c = leggo2.read()) != -1) {
            System.out.print((char)c);
            scrivo2.write(c);
        }
        leggo.close();
        leggo2.close();
        scrivo.close();
        scrivo2.close();

        /*
        int s;
        BufferedInputStream s1 = new BufferedInputStream(System.in);
        FileOutputStream s2 = new FileOutputStream("C:\\Users\\fedea\\Documents\\Programmazione in Java\\File\\src\\nuovo.txt");
        System.out.println("\n\nScrivi:");
        while ((s = s1.read()) != -1){
            s2.write(s);
        }

        s1.close();
        s2.close();
         */

        BufferedReader b1 = new BufferedReader(new FileReader("C:\\Users\\fedea\\Documents\\Programmazione in Java\\File\\src\\input.txt"));
        int contarighe = 0, contaparole = 0, contacaratteri = 0, contaalfabeto = 0;
        String s1;
        while ((s1 = b1.readLine()) != null) {
            contarighe++;
        }
        System.out.println("\nNel file input.txt ci sono "+contarighe+" righe");
        b1.close();

        FileInputStream b2 = new FileInputStream("C:\\Users\\fedea\\Documents\\Programmazione in Java\\File\\src\\input.txt");
        int s2;
        while ((s2 = b2.read()) != -1) {
            if( s2 != 32 && s2 != 10 && s2 != 13) contacaratteri++;
            if((s2 >= 65 && s2<=90) || (s2 >= 97 && s2<=122)) contaalfabeto++;
        }
        System.out.println("Nel file input.txt ci sono "+contacaratteri+" caratteri (spazi esaclusi)");
        System.out.println("Nel file input.txt ci sono "+contaalfabeto+" caratteri alfabetici");
        b2.close();

        BufferedReader p1 = new BufferedReader(new FileReader("C:\\Users\\fedea\\Documents\\Programmazione in Java\\File\\src\\input.txt"));
        PrintWriter p2 = new PrintWriter(new FileWriter("C:\\Users\\fedea\\Documents\\Programmazione in Java\\File\\src\\output.txt"));
        String p;
        System.out.println("\nAggiungo i numeri alle righe del file input.txt");
        for (int i = 0; (p = p1.readLine()) != null; i++) {
            p2.println(i+". \t"+p);
        }

        p1.close();
        p2.close();
    }
}
