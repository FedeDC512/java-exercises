import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ProvaJCB extends JFrame {
    private final JTextField input = new JTextField("Opzione disattivata",
            15);
    private final JCheckBox check = new JCheckBox("Opzione");
    private ProvaJCB () {
        input.setEditable(false);
        check.addItemListener(new MioItemListener());
        this.getContentPane().add(input, BorderLayout.NORTH);
        this.getContentPane().add(check, BorderLayout.SOUTH);}

    public static void main(String[] args) {
        final ProvaJCB f = new ProvaJCB();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack(); f.setVisible(true);}
    class MioItemListener implements ItemListener {
        @Override public void itemStateChanged(ItemEvent e){
            if (check.isSelected())
                input.setText("Opzione attivata");
            else
                input.setText("Opzione disattivata");
        } } }
