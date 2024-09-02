import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Finestra extends JFrame{
    //private final JPanel pan = new JPanel(); //base su cui aggiumgere componenti grafici
    private final JLabel l1 = new JLabel("Inserisci il nome del file: "); //Etichetta
    private final JCheckBox cb1 = new JCheckBox("Append");
    private final JTextField t1 = new JTextField(20);
    private final JButton b2 = new JButton("OK");
    private final JTextArea ta3 = new JTextArea(5,5);

    private final JPanel pan1 = new JPanel(); 
    private final JPanel pan2 = new JPanel(); 
    private final JPanel pan3 = new JPanel();

    public Finestra(){
        super("Apri un testo"); //nome finestra
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout()); //dispone i componenti in cinque zone a croce (NORTH, WEST, CENTER, EAST, SOUTH)
        //c.add(pan);
        c.add(pan1, BorderLayout.NORTH);
        c.add(pan2, BorderLayout.CENTER);
        c.add(pan3, BorderLayout.SOUTH);

        pan1.add(l1);
        pan1.add(t1);
        pan1.add(cb1);
        pan2.add(b2);

        ta3.setPreferredSize(new Dimension(400,200));
        //this.setSize(300,100);

        pan3.add(ta3);
        pan3.setBorder(BorderFactory.createTitledBorder("Testo"));
        //imposta il bordo

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}
