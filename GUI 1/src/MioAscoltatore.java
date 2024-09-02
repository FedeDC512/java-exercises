import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 

public class MioAscoltatore implements ActionListener {
    @Override 
    public void actionPerformed(ActionEvent event) {
        JButton b = (JButton) event.getSource();
        JOptionPane.showMessageDialog
        (null, "E' stato premuto " + b.getText());
         
    }

    public class MiaFinestra extends JFrame(){
        super("Finestra 1");
        Container c = this.getContentPane();
        

        this.setSize(300, 300);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new MiaFinestra();
        new MioAscoltatore();
        //super("Esempio di MouseListener");
        //this.addMouseListener(new MioMouseListener());
        //setSize(200,200);
        //setVisible(true);

    }
}