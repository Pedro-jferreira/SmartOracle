package SwingDesigner.LoginScreenGUI;

import javax.swing.*;
import java.awt.*;

public class PaintMenu extends JPanel {
    @Override
    public void paint(Graphics g) {
        g.setColor(getBackground());
        g.fillRoundRect(getX(), getY(), getWidth(), getHeight(), 40, 40);
        super.paint(g);
    }

}
