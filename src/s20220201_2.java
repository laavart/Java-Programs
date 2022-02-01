import java.awt.*;

/**
 * TextArea
 */
public class s20220201_2 {
    public static void main(String[] Args) {
        MyFrame5 f = new MyFrame5();
        f.setVisible(true);
    }
}

class MyFrame5 extends Frame{

    TextArea ta;

    MyFrame5(){
        super("TextArea Demo");
        setLayout(new FlowLayout());
        setSize(800,450);

        ta = new TextArea("TextArea", 10, 20);
        ta.append(" is Great!");
        ta.setCursor(new Cursor(2));

        add(ta);
    }
}