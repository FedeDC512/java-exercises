import java.awt.*; import javax.swing.*;

public class DisplayText extends JFrame {
    private final JLabel l1 = new JLabel("Nome file:");
    private final JCheckBox cb1 = new JCheckBox("Append");
    private final JTextField t1 = new JTextField(20);
    private final JButton b2 = new JButton("OK");
    private final JTextArea ta3 = new JTextArea(5,5);
    private final JPanel pan1 = new JPanel(); 
    private final JPanel pan2 = new JPanel(); 
    private final JPanel pan3 = new JPanel();

    private DisplayText () { //costruttore
        super("Display Text From File");
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(pan1, BorderLayout.NORTH);
        c.add(pan2, BorderLayout.CENTER);
        c.add(pan3, BorderLayout.SOUTH);
        
        pan1.add(l1);
        pan1.add(t1);
        pan1.add(cb1);
        pan2.add(b2);
        ta3.setPreferredSize(new Dimension(400,200));
       //imposta le dimensioni preferite
        pan3.add(ta3);
        pan3.setBorder
         (BorderFactory.createTitledBorder("Testo"));
        //imposta il bordo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
        
        public static void main(String[] args){
            new DisplayText();
        }
}
      

