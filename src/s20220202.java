import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class s20220202 {
    public static void main(String[] Args){
        MyFrame7 f = new MyFrame7();
        f.setVisible(true);
    }
}

class MyFrame7 extends Frame implements AdjustmentListener {

    Scrollbar r, g, b;
    TextField t;
    Color c;

    MyFrame7(){

        super("ScrollBar Demo");
        setSize(450,450);
        setLayout(null);

        c = new Color(0,0,0);

        t = new TextField(20);
        t.setEditable(false);
        t.setBackground(c);
        t.setBounds(50,100,300,30);
        add(t);

        r = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        r.setBounds(50,150,300,30);
        r.addAdjustmentListener(this);
        add(r);

        g = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        g.setBounds(50,200,300,30);
        g.addAdjustmentListener(this);
        add(g);

        b = new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        b.setBounds(50,250,300,30);
        b.addAdjustmentListener(this);
        add(b);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e){
        c = new Color(r.getValue(), g.getValue(), b.getValue());
        t.setBackground(c);
    }
}