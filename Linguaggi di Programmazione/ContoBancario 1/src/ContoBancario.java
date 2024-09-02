import java.util.*;

public class ContoBancario {

    private String nome;
    private int saldo;
    private static int id;

    public ContoBancario(){
        id++;
        System.out.println("Inserisci il nome del titolare del conto con ID "+id);
        Scanner scan = new Scanner(System.in);
        this.nome = scan.nextLine();
        
        System.out.println("Il conto di "+nome+" con ID "+id+" è stato creato");
    }

    public void versa(int i){
        saldo += i;
        System.out.println("Sono stati versati "+i+"E nel conto di "+nome);
    }

    public void preleva(int j){
        saldo -= j;
        System.out.println("Sono stati prelevati "+j+"E dal conto di "+nome);
    }

    public String getInfo(){
        return "Il conto di "+nome+" con ID "+id+" possiede un saldo di "+saldo;
    }

    public String getNome(){
        return nome;
    }


    public void trasferisci (ContoBancario c, int k){
        System.out.print("(");
        preleva(k);
        c.versa(k);
        System.out.print(")");
        System.out.println("Sono stati trasferiti "+k+"E dal conto di "+nome+" al conto di "+c.getNome());
    }
    
}
