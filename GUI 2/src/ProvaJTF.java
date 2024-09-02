import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ProvaJTF extends JFrame {
    private final JTextField input = new JTextField(10);
    private final JTextField output = new JTextField(10);
    private ProvaJTF () {
        output.setEditable(false);
        input.addActionListener(new MioAscoltatore());
        this.getContentPane().add(input, BorderLayout.NORTH);
        this.getContentPane().add(output, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        ProvaJTF f = new ProvaJTF();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack(); f.setVisible(true);
    }
    class MioAscoltatore extends ActionListener {
        @Override public void actionPerformed(ActionEvent e) {
            output.setText(input.getText());
        }
    } }