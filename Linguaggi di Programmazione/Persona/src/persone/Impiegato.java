package persone;

public class Impiegato extends Persona{
    protected String datoreLavoro;
    protected int salario;

    public Impiegato(String nome, String cognome, String datoreLavoro, int salario){
        super(nome, cognome);
        this.datoreLavoro = datoreLavoro;
        this.salario = salario;
    }

    @Override
    public void presentati() {
        System.out.println("Il mio nome è "+ super.nome + " " + super.cognome + ", sono un impiegato presso "+datoreLavoro+" e il mio salario è "+salario);
    }

    @Override
    public String toString(){
        return super.toString() + "Datore di lavoro: "+datoreLavoro+"\nSalario: "+salario+"€\n";
    }
}
