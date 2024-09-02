import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        //System.out.print(Stringhelle.getIniziali());
        //gli scanner vanno in contrasto :(
        //System.out.println();

        /*Scanner scan2 = new Scanner(System.in);
        System.out.print("Inserisci la stringa: ");
        String frase = scan2.nextLine();
        System.out.println("La stringa \"" + frase + "\" al contrario è \"" + Stringhelle.stringReverse(frase)+"\"");
        System.out.print("Inserisci il pattern da trovare nella stringa \""+ frase +"\": ");
        String pattern = scan2.nextLine();
        System.out.print("Il pattern \""+pattern+"\" è presente nella stringa \""+frase+"\" "+ Stringhelle.contaOccorrenze(frase, pattern)+" volte");
        scan2.close();*/

        Scanner scan3 = new Scanner(System.in);
        String s = scan3.next();
        System.out.println(s.matches(".+@.+\\.(com|net|edu|gov|it|fr|de)"));
        if(s.contains("@"));

        scan3.close();
    }
}
