import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;


public class ProvaJTF2 extends JFrame {
    private final JTextField input = new JTextField(10);
    private final JTextField output = new JTextField(10);
    private ProvaJTF2 () {
        output.setEditable(false);
        input.getDocument().addDocumentListener(new MioDocListener());
        this.getContentPane().add(input, BorderLayout.NORTH);
        this.getContentPane().add(output, BorderLayout.SOUTH);}

    public static void main(String[] args) {
        ProvaJTF2 f = new ProvaJTF2();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack(); f.setVisible(true);}
    class MioDocListener implements DocumentListener {
        @Override public void insertUpdate(DocumentEvent e){
            output.setText(input.getText()); }
        @Override public void removeUpdate(DocumentEvent e){
            output.setText(input.getText()); }
        @Override public void changedUpdate(DocumentEvent e){ }
    } }
