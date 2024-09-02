import java.util.ArrayList;
import java.util.Scanner;

public class Aereo {
    private String volo;
    private int numeroPosti;
    ArrayList<Posto> posti = new ArrayList<Posto>(); 

    public Aereo(String volo, int numeroPosti){
        this.volo = volo;
        this.numeroPosti=numeroPosti;
        for(int i = numeroPosti; i!=0; i--) posti.add(new Posto());

        System.out.println("Il volo "+volo+" da "+posti.size()+" posti è stato registrato");
    }

    public String getVolo(){
        return volo;
    }

    public void stampaPosti(){
        System.out.println("Posto |\tPrenotazione");
        for(int i = 0; i<numeroPosti; i++) {
            System.out.println(posti.get(i).getNumero()+"\t"+posti.get(i).getNome());
        }
    }

    public void stampaNumeri(){
        System.out.println("Posto |\tPrenotazione");
        for(int i = 0; i<numeroPosti; i++) {
            System.out.print(posti.get(i).getNumero()+"\t");
            if(posti.get(i).getNome()==null) System.out.println("Libero");
            else System.out.println("Prenotato");
        }
    }

    public void stampaPasseggeri(){
        System.out.println("Lista passeggeri:");
        for(int i = 0; i<numeroPosti; i++) {
            if(posti.get(i).getNome() != null) System.out.println(posti.get(i).getNome());
        }
    }

    public void assegnaPosto(){
        Scanner scani = new Scanner(System.in);
        Scanner scans = new Scanner(System.in);
        System.out.println("Inserisci il numero del posto che vuoi prenotare: ");
        int posto = scani.nextInt();
        if (posti.get(posto-1).getNome() == null){
            System.out.println("Inserisci il tuo nome: ");
            String nome = scans.nextLine();
            posti.get(posto-1).setNome(nome);
        }
        else{
            System.out.println("Il posto selezionato è già prenotato o non disponibile.");
        }

    }
    
    public void cancellaPosto(){
        Scanner scani = new Scanner(System.in);
        Scanner scans = new Scanner(System.in);
        System.out.println("Inserisci il numero del posto di cui vuoi cancellare la prenotazione: ");
        int posto = scani.nextInt();
        if (posti.get(posto-1).getNome() != null){
            System.out.println("Inserisci il tuo nome di chi ha prenotato tale posto: ");
            String nome = scans.nextLine();
            if(posti.get(posto-1).getNome().equals(nome)) posti.get(posto-1).setNome(null);
            else System.out.println("Non è stato possibile effettuare la cancellazione, a causa della discordanza con il nome.");
        }
        else{
            System.out.println("Il posto selezionato non possiede alcuna prenotazione.");
        }

    }
    
}
