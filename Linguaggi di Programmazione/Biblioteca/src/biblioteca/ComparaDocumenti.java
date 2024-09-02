package biblioteca;

import java.util.Comparator;

public class ComparaDocumenti implements Comparator<Documento> {

    @Override
    public int compare(Documento d1, Documento d2) {
        //i null li mette all'inizio, non alla fine ma mi abbutta aggiustalo oggi
        return d1.getCognome().compareTo(d2.getCognome());
    }
}
