import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * KeyListener
 */
public class s20220203 {
    public static void main(String[] Args){
        MyFrame8 f = new MyFrame8();
        f.setVisible(true);
    }
}

class MyFrame8 extends Frame implements KeyListener {

    Label l1, l2, l3, l4;

    MyFrame8(){

        super("Key Event demo");
        setLayout(null);
        setSize(300,300);

        l1 = new Label("");
        l1.setBounds(30,50,300,20);

        l2 = new Label("");
        l2.setBounds(30,80,300,20);

        l3 = new Label("");
        l3.setBounds(30,110,300,20);

        l4 = new Label("");
        l4.setBounds(30,140,300,20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        addKeyListener(this);
    }

    @Override
    public void keyPressed(KeyEvent e){
        l1.setText("KeyPressed");
        l3.setText("");
        l4.setText("" + e.getWhen() );
    }

    @Override
    public void keyTyped(KeyEvent e){
        l2.setText("KeyPressed: " + e.getWhen() );
    }

    @Override
    public void keyReleased(KeyEvent e){
        l1.setText("");
        l2.setText("");
        l3.setText("KeyReleased");
    }
}