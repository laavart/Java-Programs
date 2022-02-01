import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TextArea
 * Dimension
 */
public class s20220201_2 {
    public static void main(String[] Args) {
        MyFrame5 f = new MyFrame5();
        f.setVisible(true);
    }
}

class MyFrame5 extends Frame{

    TextArea ta;
    Button b;

    MyFrame5(){
        super("TextArea Demo");
        setLayout(new FlowLayout());
        Dimension d = new Dimension(800,450);
        setSize(d);

        ta = new TextArea("TextArea", 10, 20);
        ta.append(" is Great!");
        ta.setCursor(new Cursor(2));

        /**
         * getCaretPosition() returns the position of the cursor
         */

        b = new Button("Apply");
        b.addActionListener(e -> ta.setText(ta.getSelectedText()));

        /**
         * Same as:
         *      b.addActionListener(new ActionListener(){
         *
         *          @Override
         *          public void actionPerformed(ActionEvent e){
         *              ta.setText(ta.getSelectedText())
         *          }
         *      });
         */

        add(ta);
        add(b);

    }
}