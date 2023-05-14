package SwingDesigner.CustomComponents;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class JFrameCustom extends JFrame {
    Image image;

    public JFrameCustom() {
        try {
            image = ImageIO.read(new File("C:\\Users\\pedro\\Downloads\\gowther-nanatsu-no-taizai-uhdpaper.com-4K-6.1506.jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setContentPane(new JPanel(new BorderLayout()) {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(image, 0, 0, null);
            }
        });

    }
}


