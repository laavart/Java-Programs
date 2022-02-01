import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * TextField
 * TextListener
 */
public class s20220201 {
    public static void main(String[] Args){
        MyFrame4 f = new MyFrame4();
        f.setVisible(true);
    }
}

class MyFrame4 extends Frame {

    TextField tf;
    Label l1, l2;

    MyFrame4(){

        super("TextField Demo");
        setLayout(new FlowLayout());
        setSize(800,450);

        tf = new TextField("", 7);
        tf.setEchoChar('*');

        Handler h = new Handler();
        tf.addTextListener(h);
        tf.addActionListener(h);

        l1 = new Label("Waiting...");
        l2 = new Label("Waiting to Press Enter...");

        add(tf);
        add(l1,0);
        add(l2);
    }

    class Handler implements TextListener, ActionListener {
        @Override
        public void textValueChanged(TextEvent e) {
            String s = tf.getText();
            l1.setText( s.equals("") ? "_Blank_" : s );
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tf.getText();
            l2.setText( s.equals("") ? "_Blank_" : s );
        }
    }
}