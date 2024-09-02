import javax.swing.*;
import java.awt.*;

public class ProvaJButton extends JFrame {
    private final JButton btn = new JButton("Click 0");
    private final JPanel pan = new JPanel();
    private int count;
    private ProvaJButton () {
        btn.addActionListener(e -> {
            JButton button = (JButton)e.getSource();
            button.setText("Click "+count++);}
        );
        btn.setPreferredSize(new Dimension(150, 50));
        pan.add(btn);
        this.getContentPane().add(pan);
    }
    public static void main(String[] args) {
        final ProvaJButton f = new ProvaJButton();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    } }
