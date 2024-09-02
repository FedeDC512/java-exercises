import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class ActionListener implements java.awt.event.ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {
        JButton b = (JButton) event.getSource();
        JOptionPane.showMessageDialog
                (null, "E' stato premuto " + b.getText());
    }
}
