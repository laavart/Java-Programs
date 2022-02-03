import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Menu
 * MenuItem
 * CheckboxMenuItem
 */
public class s20220203_5 {
    public static void main(String[] Args){
        MyFrame12 f = new MyFrame12();
        f.setVisible(true);
    }
}

class MyFrame12 extends Frame {

    MenuBar bar;
    Menu file,sub;
    MenuItem open,save,close,closeAll;
    CheckboxMenuItem auto;

    MyFrame12(){

        super("Menu Demo");
        setSize(800,450);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        open = new MenuItem("Open");
        save = new MenuItem("Save");
        close = new MenuItem("Close");
        closeAll = new MenuItem("Close All");

        auto = new CheckboxMenuItem("AutoSave", true);

        sub = new Menu("Close", true);
        sub.add(close);
        sub.add(closeAll);

        file = new Menu("File");
        file.add(open);
        file.add(save);
        file.add(sub);
        file.add(auto);

        bar = new MenuBar();
        bar.add(file);

        close.addActionListener(e -> System.exit(0));

        this.setMenuBar(bar);
    }

}
