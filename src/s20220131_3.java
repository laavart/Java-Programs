import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Button
 */

public class s20220131_3 {
    public static void main(String[] Args){
        MyFrame2 f = new MyFrame2();
        f.setSize(400,300);
        f.setVisible(true);
    }
}

class MyFrame2 extends Frame implements ActionListener {

    int count = 0;
    Label l;
    Button b;

    MyFrame2(){
        super("Button Demo");
        setLayout(new FlowLayout());

        l = new Label(""+count);
        b = new Button("Add +1");
        b.addActionListener(this);

        add(l);
        add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(Objects.equals(e.getActionCommand(), "Add +1")){
            count++;
            l.setText("" + count);
        }
    }
}
