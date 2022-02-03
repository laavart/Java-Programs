import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

public class s20220203_3 {
    public static void main(String[] Args){
        MyFrame10 f = new MyFrame10();
        f.setVisible(true);
    }
}

class MyFrame10 extends Frame{

    MyFrame10(){

        super("Key Event demo");
        setLayout(null);
        setSize(300,300);

        addWindowListener(new MyWindowListener());
        addWindowStateListener(new MyWindowStateListener());
        addWindowFocusListener(new MyWindowFocusListener());


    }

    class MyWindowListener implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("Opened");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("Closing");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            // on calling dispose() on the window
            System.out.println("Closed");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("Iconified");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("DeIconified");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("Activated");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("DeActivated");
        }
    }

    class MyWindowStateListener implements WindowStateListener{

        @Override
        public void windowStateChanged(WindowEvent e) {
            System.out.println(e.getOldState());
            System.out.println(e.getNewState());
            System.out.println(e.getWindow());
            System.out.println(e.getOppositeWindow());
        }
    }

    class MyWindowFocusListener implements WindowFocusListener{

        @Override
        public void windowGainedFocus(WindowEvent e) {
            System.out.println("GAINED");
        }

        @Override
        public void windowLostFocus(WindowEvent e) {
            System.out.println("LOST");
        }
    }
}
