import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void print(Supplier<Integer> supplier) {
        System.out.println(supplier.get());
    }
    public static void main(String[] args) {
        List<String> parole = List.of("pippo", "pluto", "paperino");
       
        parole.forEach(System.out::println);
        print(() -> parole.get(0).length()); //stampa la lunghezza della parola in posizione zero
        //print(() -> parole.get(0).length());
        String[] p = parole.toArray(String[]::new);
    }
}