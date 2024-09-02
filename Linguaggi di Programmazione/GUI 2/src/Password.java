import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Password {
    public static class MyFrame extends JFrame {
        private final JPanel centro = new JPanel();
        private final JPanel sud = new JPanel();
        private final JPasswordField t1 = new JPasswordField(20);
        private final JButton b1 = new JButton("Mostra password");

        public JPasswordField getPasswordField() {
            return this.t1;
        } //implementazione di un metodo get per accedere all’attributo private dall’esterno della classe

        private MyFrame() {
            super("Ascoltatore con costruttore");
            Container c = this.getContentPane();
            centro.add(t1);
            b1.addActionListener(new MioAscoltatore(this));
            sud.add(b1);
            c.add(centro, BorderLayout.CENTER);
            c.add(sud, BorderLayout.SOUTH);

            setSize(300, 100);
            setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        public class MioAscoltatore extends ActionListener {
            private final MyFrame finestra;

            public MioAscoltatore(MyFrame finestra) {
                this.finestra = finestra;
            }

            public void actionPerformed(ActionEvent event) {
                JPasswordField text = finestra.getPasswordField();
                JOptionPane.showMessageDialog
                        (null, new String(text.getPassword()));
                //getPassword() restituisce un char[]
            }
        }
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
