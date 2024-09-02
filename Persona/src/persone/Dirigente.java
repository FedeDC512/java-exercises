package persone;

public class Dirigente extends Impiegato{
    protected String dipartimento;

    public Dirigente(String nome, String cognome, String datoreLavoro, int salario, String dipartimento){
        super(nome, cognome, datoreLavoro, salario);
        this.dipartimento = dipartimento;
    }

    @Override
    public void presentati() {
        System.out.println("Il mio nome è "+ super.nome + " " + super.cognome + ", sono un dirigente presso "+super.datoreLavoro+" nel dipartimento "+dipartimento+" e il mio salario è "+super.salario);
    }

    @Override
    public String toString(){
        return super.toString() + "Dipartimento: "+dipartimento+"\n";
    }
}
