import java.awt.*;

public class s20220131_2 {
    public static void main(String[] Args){
        MyFrame mf = new MyFrame();
        mf.setSize(400,300);
        mf.setVisible(true);
    }
}

class MyFrame extends Frame {
    Label l;
    TextField tf;
    Button b;

    MyFrame(){
        super("My Application");

        setLayout(new FlowLayout());
        setResizable(false);

        l = new Label("Name:");
        tf = new TextField(20);
        b = new Button("Submit");

        add(l);
        add(tf);
        add(b);
    }
}