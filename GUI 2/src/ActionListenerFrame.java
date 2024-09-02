import javax.swing.*;
import java.awt.*;

public class ActionListenerFrame extends JFrame {

    private ActionListener asc = new ActionListener();


    private ActionListenerFrame() {
        super("Finestra per ActionListener");
        Container c = this.getContentPane();
        //uno.addActionListener(asc);
        //due.addActionListener(asc);
        //tre.addActionListener(asc);
        //quattro.addActionListener(asc);
        //cinque.addActionListener(asc);
        setSize(200,200);
        setVisible(true);
    }
}
