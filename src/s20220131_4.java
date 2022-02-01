
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * CheckBox
 */
public class s20220131_4 {
    public static void main(String[] Args){
        MyFrame3 f = new MyFrame3();
        f.setSize(400,300);
        f.setVisible(true);
    }
}

class MyFrame3 extends Frame implements ItemListener{

    Label l;
    Checkbox c1,c2,c3,c4;
    CheckboxGroup cbg;

    MyFrame3(){
        super("CheckBox Demo");
        setLayout(new FlowLayout());

        l = new Label("Language");
        cbg = new CheckboxGroup();

        c1 = new Checkbox("Java",cbg,false);
        c1.addItemListener(this);

        c2 = new Checkbox("C++",false,cbg);
        c2.addItemListener(this);

        c3 = new Checkbox("C#",false);
        c3.setCheckboxGroup(cbg);
        c3.addItemListener(this);

        c4 = new Checkbox("AWT");
        c4.addItemListener(this);

        add(l);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(!c4.getState()){
            Checkbox item = cbg.getSelectedCheckbox();
            if (c1.equals(item)) {
                l.setText("Java");
            } else if (c2.equals(item)) {
                l.setText("C++");
            } else if (c3.equals(item)) {
                l.setText("C#");
            } else {
                l.setText("Language");
            }
        }
        else{
            l.setText("AWT");
        }
    }
}