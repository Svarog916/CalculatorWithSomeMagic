package window;

import javax.swing.*;

public class jPanel extends JPanel {
    public jPanel() {
        setBounds(150, 100, 300, 450);
        add(new jTextArea("0"));
//        for (int i = 0; i < 2; i++) {
//            add(new jButton(String.valueOf(i)));
//        }
        setVisible(true);
    }
}
