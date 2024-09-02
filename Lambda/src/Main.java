import java.util.function.Predicate;

public class Main{
    public static boolean verificaInteger(Integer numero, Predicate<Integer> proprieta) {
        return proprieta.test(numero);
    }
    public static void main(String[] args) {
        int n = 11;
        System.out.println(verificaInteger(n, x -> x%2 == 0));
    }
}