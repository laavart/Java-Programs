import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class s20220131_4 {
    public static void main(String[] Args){
        MyFrame3 f = new MyFrame3();
    }
}

class MyFrame3 extends Frame implements ItemListener{

    Label l;
    Checkbox c1,c2,c3;


    MyFrame3(){
        super("CheckBox Demo");
        setLayout(new FlowLayout());

        l = new Label("Language");
        c1 = new Checkbox("Java");
        c2 = new Checkbox("C++");
        c3 = new Checkbox("C#");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}