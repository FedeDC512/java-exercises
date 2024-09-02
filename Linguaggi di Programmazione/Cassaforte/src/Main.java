import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Cassaforte c1 = new Cassaforte();
        Menu(c1);
    }

    public static void Menu(Cassaforte c) throws Exception{
        System.out.println("Benvenuto nel menu della cassaforte, scegli cosa fare:\n"+
            "1 - Stampa il messaggio\n2 - Reimposta la password\n0 - Esci");
        int menu = 1;
        Scanner scan = new Scanner (System.in);
        menu = scan.nextInt();
        while(menu != 0){
            if(menu == 1) c.getMsg();
            else if (menu == 2) c.resetPass();
            else System.out.println("Valore non valido!");
            
            System.out.println("Benvenuto nel menu della cassaforte, scegli cosa fare:\n"+
            "1 - Stampa il messaggio\n2 - Reimposta la password\n0 - Esci");
            menu = scan.nextInt();
        }
        scan.close();
    }

}
