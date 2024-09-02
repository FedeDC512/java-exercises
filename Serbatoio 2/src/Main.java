public class Main {
    public static void main (String[] args) {
        Serbatoio s1 = new Serbatoio();
        System.out.println("Livello attuale di s1: "+ s1.getLivello());
        s1.rifornisci(5);
        System.out.println("Livello attuale di s1: "+ s1.getLivello());
        s1.consuma(3);
        System.out.println("Livello attuale di s1: "+ s1.getLivello());
        s1.consuma(5);
        System.out.println("Livello attuale di s1: "+ s1.getLivello());

        Serbatoio s2 = new Serbatoio(20);
    }
}
