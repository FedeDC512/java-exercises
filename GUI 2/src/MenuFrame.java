import java.awt.*; import javax.swing.*;

public class MenuFrame extends JFrame {
    private final JMenuBar barraMenu = new JMenuBar();
    private final JMenu menu1 = new JMenu("Primo menu");
    private final JMenu menu2 = new JMenu("Altro menu");
    private final JMenu submenu = new JMenu("Un sottomenu");
    private final JMenuItem voceMenu1 = new JMenuItem("Prima voce di menu");
    private final JMenuItem voceMenu2 = new JMenuItem("Seconda voce di menu");
    private final JMenuItem voceMenu3 = new JMenuItem("Voce di sottomenu");

    private MenuFrame () {
        super("Prova menu");
        Container c = this.getContentPane();
        menu1.add(voceMenu1);
        menu2.add(voceMenu2);
        submenu.add(voceMenu3);
        menu2.add(submenu);
        barraMenu.add(menu1);
        barraMenu.add(menu2);
        this.setJMenuBar(barraMenu);
        this.setSize(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args){
        new MenuFrame();
    }
}
