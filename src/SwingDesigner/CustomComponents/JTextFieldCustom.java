package SwingDesigner.CustomComponents;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;

public class JTextFieldCustom extends JTextField {
    private int radius = 10;

    public JTextFieldCustom() {
        setOpaque(false);
    }

    public JTextFieldCustom(String text) {
        super(text);
        setOpaque(false);
    }

    public JTextFieldCustom(int columns) {
        super(columns);
        setOpaque(false);
    }

    public JTextFieldCustom(String text, int columns) {
        super(text, columns);
        setOpaque(false);
    }

    public JTextFieldCustom(Document doc, String text, int columns) {
        super(doc, text, columns);
        setOpaque(false);
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
        g.setColor(getForeground());
        g.drawRoundRect(0, 0, getWidth() , getHeight(), getRadius(), getRadius());
        super.paintBorder(g);
        g.dispose();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
