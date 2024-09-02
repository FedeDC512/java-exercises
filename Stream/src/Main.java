import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Persona> persone = new ArrayList<Persona>();
        persone.add(new Persona("Mario", 40, 'M'));
        persone.add(new Persona("Luigi", 36, 'M'));
        persone.add(new Persona("Peach", 35, 'F'));
        persone.add(new Persona("Toad", 18, 'T'));
        persone.add(new Persona("Luca", 10, 'M'));
        persone.stream().forEach(p -> p.presentati());
        System.out.println("Età media M:\n"+persone.stream().filter(p -> p.getSesso() == 'M').mapToInt(p -> p.getEta()).average());
        System.out.println();

        HashMap<Integer, String> numeri = new HashMap<Integer, String>();
        numeri.put(10, "Dieci");
        numeri.put(15, "Quindici");
        numeri.put(20, "Venti");
        numeri.put(25, "Venticinque");
        numeri.put(30, "Trenta");
        numeri.entrySet().stream().forEach(System.out::println);
        System.out.println("Chiave valore massimo:\n"+numeri.entrySet().stream().max(Comparator.comparing(a -> a.getKey())));
        System.out.println();

        Stream.of(NumeriEnum.values()).forEach(g -> System.out.println(g+" "+g.getNumero()));
        System.out.println("\nNumeri con numero di caratteri pari alla metà del numero stesso:");
        Stream.of(NumeriEnum.values()).filter(g -> g.toString().length() == g.getNumero()/2).forEach(System.out::println);
    
    } 

    public enum NumeriEnum {
        UNO(1),
        DUE(2),
        TRE(3),
        QUATTRO(4),
        CINQUE(5),
        SEI(6),
        SETTE(7),
        OTTO(8),
        NOVE(9),
        DIECI(10),
        UNDICI(11),
        DODICI(12),
        TREDICI(13),
        QUATTORDICI(14),
        QUINDICI(15);

        private int n;

        public int getNumero() {
            return n;
        }
        private NumeriEnum(int n){
            this.n = n;
        }

    }

}