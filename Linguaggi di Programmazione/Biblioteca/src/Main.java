import biblioteca.Catalogo;
import biblioteca.Menu;

public class Main {
    public static void main (String[] args) throws Exception {
        Catalogo c1 = new Catalogo();
        Menu.start(c1);
    }
}
