import java.util.Scanner;

public class Cassaforte {
    private String pass;
    private String msg;
    private int accessi = 3;

    public Cassaforte(){
        System.out.println("Crea la tua cassaforte!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci la password:");
        passCheck();
        //this.pass = scan.nextLine();
        System.out.println("Inserisci il messaggio segreto:");
        this.msg = scan.nextLine();
        System.out.println("Password e messaggio salvati.");
        System.out.println("Cassaforte creata con successo!");
    }

    private void passCheck(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci una password lunga almeno sei caratteri e che contenga almeno una cifra:");
        String verifica = scan.nextLine();
        boolean flag = true;
        while(flag){
            if(verifica.matches("\\w*\\d\\w*") && verifica.length()>=6){
                this.pass=verifica;
                flag = false;
            }
            else {
                System.out.println("Password non valida!");
                System.out.println("Inserisci la password:");
                verifica = scan.nextLine();
            };
        }
    }

    public void getMsg(){
        while(accessi>0){
            Scanner scan = new Scanner(System.in);
            System.out.println("Inserisci la password:");
            String provapass = scan.nextLine();
            if(pass.equals(provapass)){
                System.out.println("Password corretta!");
                System.out.println("Il messaggio è \""+msg+"\"");
                return;
            }
            else {
                System.out.println("Password errata!");
                accessi--;
                System.out.println(accessi+" tentativi rimasti");
            }
        }
        throw new PasswordErrataException ();

    }

    public void resetPass(){
        while(accessi>0){
            Scanner scan = new Scanner(System.in);
            System.out.println("Inserisci la vecchia password:");
            String provapass = scan.nextLine();
            if(pass.equals(provapass)){
                System.out.println("Password corretta!");
                System.out.println("Ora potrai reimpostare la password.");
                passCheck();
                //this.pass = scan.nextLine();
                System.out.println("Password correttamente modificata!");
                return;
            }
            else {
                System.out.println("Password errata!");
                accessi--;
                System.out.println(accessi+" tentativi rimasti");
            }
        }
        throw new PasswordErrataException ();
    }
}
