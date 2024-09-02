public class Main{
    public static void main (String[] args){
        Serbatoio s1 = new Serbatoio();
        Serbatoio s2 = new Serbatoio(30);

        s1.rifornisci(10);
        System.out.println("Il livello del serbatoio s1 è "+s1.getLivello());
        s1.consuma(5);
        System.out.println("Il livello del serbatoio s1 è "+s1.getLivello());

        s2.consuma(15);
        System.out.println("Il livello del serbatoio s2 è "+s2.getLivello());
    }
}
