public class Posto {
    private int numero;
    private static int contanumero = 0;
    private String nome;

    public Posto(){
        contanumero++;
        numero=contanumero;
        nome = null;
    }

    public String getNome(){
        return nome;
    }
    
    public int getNumero(){
        return numero;
    }

    public void setNome(String nome){
        this.nome = nome;
        if(this.nome == null) System.out.println("La cancellazione è avvenuta con successo");
        else System.out.println("Il posto numero "+numero+" è stato prenotato da "+this.nome);
    }
}
