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
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getRadius(), getRadius());
        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getForeground());
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, getRadius(), getRadius());
        super.paintBorder(g);
        g2.dispose();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
