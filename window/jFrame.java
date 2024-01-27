package window;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class jFrame extends JFrame {
    public jFrame() throws IOException {
        setTitle("Calculator");
        setBounds(150, 100, 300, 450);
        setIconImage(ImageIO.read(new File("window/icon.png")));
        add(new jTextArea("0"));

        JInternalFrame jInternalFrame = new JInternalFrame();
        jInternalFrame.setVisible(true);
        jInternalFrame.setBounds(0,0,100,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
