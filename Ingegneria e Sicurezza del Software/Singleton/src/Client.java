public class Client {
    public static void main (String[] args) {
        Singleton sing1 = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance();
        System.out.println("Confronto istanza Singleton: "+ (sing1==sing2));
    }
}
