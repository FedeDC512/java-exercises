import java.awt.*;
import javax.swing.*;
public class FirstGUI extends JFrame {

    private final JPanel pan = new JPanel();
    private final JLabel l1 = new JLabel("Etichetta");
    private final JButton b1 = new JButton("Pulsante");
    private final JCheckBox cb1 = new JCheckBox("Spunta");
    private final JRadioButton r1 = new JRadioButton("Radio"); 
    private final JTextField t1 = new JTextField("Testo");

    private FirstGUI () {
        super("Una finestra");
        Container c = this.getContentPane();
        c.add(pan);
        pan.add(l1);
        pan.add(b1);
        pan.add(cb1);
        pan.add(r1);
        pan.add(t1);
        this.setSize(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new FirstGUI(); 
    }
}