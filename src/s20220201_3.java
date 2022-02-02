import java.awt.*;
import java.util.Arrays;

/**
 * ListBox
 * Choice
 */
public class s20220201_3 {
    public static void main(String[] Args){
        MyFrame6 f = new MyFrame6();
        f.setVisible(true);
    }
}

class MyFrame6 extends Frame{

    List l;
    Choice c;
    Button b;

    MyFrame6(){

        super("ListBox and Choice Demo");
        setLayout(new FlowLayout());
        setSize(800,450);

        /**
         * if set true then act as CheckBox;
         */
        l = new List(4,true);

        /**
         * Act as Radio Button
         */
        c = new Choice();

        l.add("Java");
        l.add("C++",0);
        l.add("C#",1);
        l.add("Python");
        add(l);

        c.add("C++");
        c.add("C#");
        c.add("Java");
        c.add("Python");
        c.addItemListener(e -> System.out.println("Choice: "+c.getSelectedItem()));
        add(c);

        b = new Button("Apply");
        b.addActionListener(e -> System.out.println( "List: "+Arrays.toString(l.getSelectedItems()) ));
        add(b);
    }
}
