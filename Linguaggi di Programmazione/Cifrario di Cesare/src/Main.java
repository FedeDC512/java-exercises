import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader r1 = new FileReader("C:\\Users\\fedea\\Documents\\Programmazione in Java\\Cifrario di Cesare\\src\\input.txt");
        FileWriter r2 = new FileWriter("C:\\Users\\fedea\\Documents\\Programmazione in Java\\Cifrario di Cesare\\src\\criptato.txt");
        FileReader r3 = new FileReader("C:\\Users\\fedea\\Documents\\Programmazione in Java\\Cifrario di Cesare\\src\\criptato.txt");

        int c = 0;
        while ((c = r1.read()) != -1) {
            if(c >= 97 && c<=119) c -= 29;
            else if(c == 120 || c == 121 || c == 122) c -= 55; //x, y, z
            else {
                System.out.println("Il messaggio non può essere crittografato");
                break;
            }
            r2.write(c);
        }
        r1.close();
        r2.close();

        while ((c = r3.read()) != -1) {
            if(c >= 68 && c<=90) c+= 29;
            else if(c == 65 || c == 66 || c == 67) c += 55; //A, B, C
            else {
                System.out.println("Il messaggio non può essere decrittato");
                break;
            }
            System.out.print((char)c);
        }

        r3.close();
    }
}
