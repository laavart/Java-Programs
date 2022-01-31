import java.awt.*;

/**
 * Frameworks
 * AWT
 * Swing
 * JavaFX
 */
public class s20220131 {
    public static void main(String[] Args){
        /**
         * Frame is combination of window and its border
         */
        Frame f = new Frame("Test AWT");
        f.setSize(800, 450);
        f.setResizable(true);
        f.setLayout(new FlowLayout());

        Button b = new Button("Button");
        Dimension d = new Dimension(20, 7);
        f.add(b);

        Label l = new Label("Label: ");
        f.add(l,0);

        TextField t = new TextField(10);
        f.add(t,1);

        f.setVisible(true);
    }
}
