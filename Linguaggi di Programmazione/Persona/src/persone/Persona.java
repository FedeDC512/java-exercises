package persone;

import java.util.Objects;

public class Persona {
    protected String nome;
    protected String cognome;

    public Persona(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
    }

    public void presentati() {
        System.out.println("Ciao, sono "+ nome + " " + cognome + " e sono una persona");
    }

    @Override
    public String toString(){
        return "Nome: "+nome+"\nCognome: "+cognome+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nome.equals(persona.nome) && cognome.equals(persona.cognome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome);
    }
}
