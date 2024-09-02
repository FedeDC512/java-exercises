import java.util.*;

public class ContoBancario {
    private int saldo;
    private String nome;
    private String cognome;
    private final int numeroConto;
    private static int contaNumeroConto = 0;

    public ContoBancario(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il nome del titolare: ");
        this.nome = scan.nextLine();
        System.out.print("Inserisci il cognome del titolare: ");
        this.cognome =scan.nextLine();
        numeroConto = contaNumeroConto++;
    }

    public void versa(int a){
        this.saldo += a;
        System.out.println("Hai correttamente versato " + a + "€ nel conto di "+ nome + " " + cognome);
    }

    public void preleva(int b){
        this.saldo -= b;
        System.out.println("Hai correttamente prelevato " + b + "€ dal conto di "+ nome+ " " + cognome);
    }

    public void addSaldo(int a){
        this.saldo += a;
    }

    public int getSaldo(){
        return this.saldo;
    }

    public String getNomeCompleto(){
        return nome + " " + cognome;
    }

    public void trasferisci(ContoBancario ricevente, int soldi){
        this.saldo -= soldi;
        ricevente.addSaldo(soldi);
        System.out.println("Sono stati versati correttamente "+ soldi +"€ dal conto di "+ nome + " " + cognome +" a quello di "+ ricevente.getNomeCompleto());
    }

    @Override
    public String toString(){
        return "Conto a nome di: " + this.nome + " " + this.cognome +"\nCodice identificativo: "+ this.numeroConto + "\nSaldo attuale: " + this.saldo + "€\n";
    }
}
