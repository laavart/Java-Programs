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

        }

        @Override
        public void windowClosing(WindowEvent e) {

        }

        @Override
        public void windowClosed(WindowEvent e) {

        }

        @Override
        public void windowIconified(WindowEvent e) {

        }

        @Override
        public void windowDeiconified(WindowEvent e) {

        }

        @Override
        public void windowActivated(WindowEvent e) {

        }

        @Override
        public void windowDeactivated(WindowEvent e) {

        }
    }

    class MyWindowStateListener implements WindowStateListener{

        @Override
        public void windowStateChanged(WindowEvent e) {

        }
    }

    class MyWindowFocusListener implements WindowFocusListener{

        @Override
        public void windowGainedFocus(WindowEvent e) {

        }

        @Override
        public void windowLostFocus(WindowEvent e) {

        }
    }
}
