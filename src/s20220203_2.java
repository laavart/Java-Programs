import java.awt.*;
import java.awt.event.*;

/**
 * MouseListener
 * MouseMotionListener
 * MouseWheelListener
 */
public class s20220203_2 {
    public static void main(String[] Args){
        MyFrame9 f = new MyFrame9();
        f.setVisible(true);
    }
}

class MyFrame9 extends Frame {

    Label l1,l2,l3;

    MyFrame9(){

        super("MouseEvent Demo");
        setSize(800,450);
        setLayout(new FlowLayout());

        l1 = new Label("Clicked on Window");
        l2 = new Label("Clicked on Screen");
        l3 = new Label("Position on Window");

        add(l1);
        add(l2);
        add(l3);

        addMouseListener(new MyMouseListener());
        addMouseMotionListener(new MyMouseMotionListener());
        addMouseWheelListener(new MyMouseWheelListener());
    }

    class MyMouseListener implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            l1.setText(e.getPoint().toString());
        }

        @Override
        public void mousePressed(MouseEvent e) {
            l2.setText(e.getLocationOnScreen().toString());
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Released");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Entered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Exited");
        }
    }

    class MyMouseMotionListener implements MouseMotionListener{

        @Override
        public void mouseDragged(MouseEvent e) {
            l3.setText("Dragged: "+e.getPoint());
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            l3.setText(e.getPoint().toString());
        }
    }

    class MyMouseWheelListener implements MouseWheelListener {

        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            System.out.println(e.getWheelRotation());
            System.out.println(e.getScrollType());
            System.out.println(e.getScrollAmount());
            System.out.println(e.getPreciseWheelRotation());
            System.out.println(e.getUnitsToScroll());
        }
    }
}