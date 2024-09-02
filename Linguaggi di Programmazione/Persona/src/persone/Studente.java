package persone;

public class Studente extends Persona{
    protected String universita;
    protected String matricola;

    public Studente(String nome, String cognome, String universita, String matricola){
        super(nome, cognome);
        this.universita = universita;
        this.matricola = matricola;
    }

    @Override
    public void presentati() {
        System.out.println("Mi chiamo "+ super.nome + " " + super.cognome + " e sono uno studente presso "+universita+" (Matricola: "+matricola+")");
    }

    @Override
    public String toString(){
        return super.toString() + "Università: "+universita+"\nMatricola: "+matricola+"\n";
    }
}
