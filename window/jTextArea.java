package window;

import javax.swing.*;
import java.awt.*;

public class jTextArea extends JTextArea {
    public jTextArea(String text) {
        super(text);
        setBounds(0,0,30, 45);
        setBackground(Color.GRAY);
        setBorder(BorderFactory.createMatteBorder(10,10,10,10, Color.DARK_GRAY));
        setFont(Font.getFont("FOREGROUND"));
        setVisible(true);
    }
}
