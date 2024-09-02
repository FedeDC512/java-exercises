import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Aereo a1 = new Aereo("BA2490", 5);
        Menu(a1);
    }

    public static void Menu(Aereo a) throws Exception{
        System.out.println("Benvenuto nel menu per prenotare il volo "+a.getVolo()+", scegli cosa fare:\n"+
            "1 - Visualizza info volo (Privato!)\n2 - Visualizza posti liberi\n3 - Visualizza lista passegeri\n"+
            "4 - Prenota posto\n5 - Cancella prenotazione\n0 - Esci");
        int menu = 1;
        Scanner scan = new Scanner (System.in);
        menu = scan.nextInt();
        while(menu != 0){
            if(menu == 1) a.stampaPosti();
            else if (menu == 2) a.stampaNumeri();
            else if (menu == 3) a.stampaPasseggeri();
            else if (menu == 4) a.assegnaPosto();
            else if (menu == 5) a.cancellaPosto();
            else System.out.println("Valore non valido!");
            
            System.out.println("Benvenuto nel menu per prenotare il volo "+a.getVolo()+", scegli cosa fare:\n"+
            "1 - Visualizza info volo (Privato!)\n2 - Visualizza posti liberi\n3 - Visualizza lista passegeri\n"+
            "4 - Prenota posto\n5 - Cancella prenotazione\n0 - Esci");
            menu = scan.nextInt();
        }
        scan.close();
    }
}
