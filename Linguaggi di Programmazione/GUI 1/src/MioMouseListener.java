import java.awt.event.*;

public class MioMouseListener implements MouseListener {

    @Override public void mouseClicked(MouseEvent e) {
        System.out.println
        ("Click su ("+e.getX()+","+e.getY()+")");
    }

    @Override public void mousePressed(MouseEvent e) {
        System.out.println
        ("Premuto su ("+e.getX()+","+e.getY()+")");
    }

    @Override public void mouseReleased(MouseEvent e) {
        System.out.println
        ("Rilasciato su ("+e.getX()+","+e.getY()+")");
    }

    @Override public void mouseEntered(MouseEvent e) { }

    @Override public void mouseExited(MouseEvent e) { }
}