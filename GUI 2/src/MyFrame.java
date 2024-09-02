import java.awt.*; import javax.swing.*;
public class MyFrame extends JFrame {
    private final JButton uno = new JButton("Uno");
    private final JButton due = new JButton("Due");
    private final JButton cinque = new JButton("Cinque");
    private MyFrame () {
        super("Esempio FlowLayout");
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(uno, BorderLayout.WEST);
        c.add(due, BorderLayout.CENTER);
        c.add(cinque, BorderLayout.SOUTH);
        this.setSize(300,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new MyFrame();
    }
}