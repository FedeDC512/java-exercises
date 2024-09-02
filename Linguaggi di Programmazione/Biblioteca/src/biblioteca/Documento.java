package biblioteca;

import java.io.Serializable;

public abstract class Documento implements Serializable {
    protected static int value = 0;
    protected int ID;

    public Documento(){
        ID = value++;
        System.out.println("Hai scelto di inserire un "+getInfo()+" nel Catalogo!");
    }

    public void assegnavalue (int value){
        this.value = value;
    }

    public abstract String getInfo();

    public abstract String vediPrestabile();
    public abstract String restiPrestabile();
    public abstract String prendiPrestabile();
    public abstract String getCognome();
}
