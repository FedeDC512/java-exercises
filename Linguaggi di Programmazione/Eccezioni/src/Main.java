import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int a=0;
        boolean flag = true;
        while (flag){
            try{
                System.out.print("Inserisci un valore intero: ");
                Scanner scan = new Scanner(System.in);
                a = scan.nextInt();
                flag = false;
                scan.close();
            }
            catch(InputMismatchException ex){
                System.out.println("Il valore inserito non è un intero!");
            }
        }
        System.out.println("L'inverso moltiplicativo di "+a+" è "+(float)1/a);
    }
}
