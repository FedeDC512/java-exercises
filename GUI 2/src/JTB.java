import java.awt.*;
import javax.swing.*;
public class JTB extends JFrame {

    private final JButton btn1, btn2, btn3, btn4;
    private final JToolBar toolbar;

    private JTB() {
        btn1 = new JButton("UNO");
        btn2 = new JButton("DUE");
        btn3 = new JButton("TRE");
        btn4 = new JButton("QUATTRO");

        toolbar = new JToolBar(JToolBar.VERTICAL);
        toolbar.add(btn1);
        toolbar.addSeparator();
        toolbar.add(btn2);
        toolbar.addSeparator();
        toolbar.add(btn3);
        toolbar.addSeparator();
        toolbar.add(btn4);
        toolbar.addSeparator();
        JPanel pan = new JPanel();
        pan.setPreferredSize(new Dimension(300, 300));
        pan.setBackground(Color.WHITE);
        this.getContentPane().add(pan);
        this.getContentPane().add(toolbar, BorderLayout.WEST);
    }

    public static void createAndShowGUI() {
        JTB f = new JTB();
        f.setTitle("Esempio di JToolBar");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}

