import java.awt.*;

/**
 * CardLayout
 */
public class s20220203_4 {
    public static void main(String[] Args){
        MyFrame11 f = new MyFrame11();
        f.setVisible(true);
    }
}

class MyFrame11 extends Frame {

    CardLayout cl;
    Panel c,m,m1,m2;
    CheckboxGroup g;
    Checkbox c1,c2;
    Button b1,b2,b3;
    TextField tf1, tf2,tf3;

    MyFrame11(){

        super("CardLayout Demo");
        setSize(800, 450);

        g = new CheckboxGroup();

        c1 = new Checkbox("First",true,g);
        c1.addItemListener(e -> {
            if(c1.getState()){
                cl.first(m);
            }
        });

        c2 = new Checkbox("Second",false,g);
        c2.addItemListener(e -> {
            if(c2.getState()){
                cl.last(m);
            }
        });

        c = new Panel(new FlowLayout());
        c.add(c1);
        c.add(c2);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");

        tf1 = new TextField("1");
        tf2 = new TextField("2");
        tf3 = new TextField("3");

        m1 = new Panel();
        m1.add(b1);
        m1.add(b2);
        m1.add(b3);

        m2 = new Panel();
        m2.add(tf1);
        m2.add(tf2);
        m2.add(tf3);

        cl = new CardLayout();

        m = new Panel(cl);
        m.add("One", m1);
        m.add("Two", m2);

        add(c,BorderLayout.NORTH);
        add(m, BorderLayout.CENTER);
    }

}