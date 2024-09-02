import javax.swing.*;
import java.awt.event.*;

public class KeyLogger extends JFrame {
    private KeyLogger() {
        super("Esempio di KeyAdapter");
        this.addKeyListener(new KeyAdapter() {
            @Override public void keyTyped( KeyEvent ev ) {
                char c = ev.getKeyChar();
                if ( c != KeyEvent.CHAR_UNDEFINED)
                    System.out.print(c);
            }
        });
        this.setSize(200,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new KeyLogger(); }
}
