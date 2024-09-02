import javax.swing.*;

public class MouseListenerFrame extends JFrame {
    private MouseListenerFrame() {
        super("Esempio di MouseListener");
        this.addMouseListener(new MioMouseListener());
        setSize(200,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new MouseListenerFrame();
    }
}
