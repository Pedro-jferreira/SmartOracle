package SwingDesigner.CustomComponents;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;

public class JPasswordFieldCustom extends JPasswordField {
    private int radius=10;
    public JPasswordFieldCustom(String text) {
        super(text);
    }

    public JPasswordFieldCustom(int columns) {
        super(columns);
        setOpaque(false);
    }

    public JPasswordFieldCustom(String text, int columns) {
        super(text, columns);
    }

    public JPasswordFieldCustom(Document doc, String txt, int columns) {
        super(doc, txt, columns);
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(getBackground());
        g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getRadius(), getRadius());
        super.paintComponent(g);
        g.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        g.setColor(Color.magenta);
        g.drawRoundRect(0, 0, getWidth()-1 , getHeight()-1 , getRadius(), getRadius());

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
