import java.util.Scanner;

public class Stringhelle {

    public static String getIniziali(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il nome: ");
        String nome = scan.nextLine();
        System.out.print("Inserisci il cognome: ");
        String cognome = scan.nextLine();
        scan.close();

        return nome.charAt(0) + " & " + cognome.charAt(0) ;
    }

    public static String stringReverse(String a){
        String b = new String();

        for(int i = a.length() ; i>0 ; i--){
            b += a.charAt(i-1);
        }
        return b;
    }

    public static int contaOccorrenze(String a, String trova){
        int i = 0;
        while(a.contains(trova)){
            i++;
            a = a.replaceFirst(trova,"");
        }
        return i;
    }
}
