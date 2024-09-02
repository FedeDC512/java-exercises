public class Persona {
    protected String nome;
    protected int eta;
    protected char sesso;


    public Persona(String nome, int eta, char sesso){
        this.nome = nome;
        this.eta = eta;
        this.sesso = sesso;
    }

    public void presentati() {
        System.out.println("Ciao, sono "+ nome +" di sesso "+sesso+" e ho "+eta+" anni.");
    }

    public int getEta(){
        return eta;
    }

    public char getSesso(){
        return sesso;
    }

}