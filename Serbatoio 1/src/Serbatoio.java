public class Serbatoio {
    private int livello;
    private final int CAPACITA;

    public Serbatoio(){
        CAPACITA = 10;
        System.out.println("È stato creato un serbatoio di capacità "+ this.CAPACITA);
    }

    public Serbatoio(int CAPACITA){
        this.CAPACITA = CAPACITA;
        System.out.println("È stato creato un serbatoio di capacità "+ this.CAPACITA);
    }
    
    public void rifornisci (int i){
        livello += i;
    }
    
    public void consuma (int j){
        livello -= j;
    }

    public int getLivello (){
        return livello;
    }

}
