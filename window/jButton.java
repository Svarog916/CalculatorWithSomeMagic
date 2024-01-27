package window;

import javax.swing.*;
import java.awt.*;

public class jButton extends JButton {
    public jButton(String text) {
        setText(text);
        setPreferredSize(new Dimension(23,23));
        setSize(23, 23);
        setBackground(Color.DARK_GRAY);
        setVisible(true);
    }
}
