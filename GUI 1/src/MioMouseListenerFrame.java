import java.awt.*; import javax.swing.*;

public class MioMouseListenerFrame extends JFrame {
    private MioMouseListenerFrame() {
        super("Esempio di MouseListener");
        this.addMouseListener(new MioMouseListener());
        setSize(200,200);
        setVisible(true);
    } 

    public static void main(String[] args){
        new MioMouseListenerFrame();
    }
}