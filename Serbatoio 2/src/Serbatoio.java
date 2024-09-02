public class Serbatoio {
    private int livello = 0;
    private final int CAPACITA;

    public Serbatoio() {
        CAPACITA = 10;
        System.out.println("Serbatoio creato e capacità inizializzata a " + CAPACITA);
    }

    public Serbatoio(int CAPACITA) {
        this.CAPACITA = CAPACITA;
        System.out.println("Serbatoio creato e capacità inizializzata a " + CAPACITA);
    }

    public void rifornisci (int a) {
        this.livello += a;
        System.out.println("Il livello è aumentato di "+ a);
    }
    public void consuma (int b) {
        this.livello -= b;
        System.out.println("Il livello è diminuito di "+ b);
    }

    public int getLivello(){
        return this.livello;
    }

    public int getcapacita(){
        return this.CAPACITA;
    }

}
