import javax.swing.*;

public class ProvaJScroll extends JFrame {
    JTextArea textarea = new JTextArea(10, 10);
    JScrollPane scrollpane = new JScrollPane();

    private ProvaJScroll() {
        scrollpane.setViewportView(textarea);
        scrollpane.setBorder
                (BorderFactory.createTitledBorder("Testo"));

        this.getContentPane().add(scrollpane);
    }

    public static void main(String[] args) {
        ProvaJScroll f = new ProvaJScroll();
        f.pack();
        f.setVisible(true);
    }
}
