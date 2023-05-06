package SwingDesigner.CustomComponents;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.Format;

public class JFormattedTextFieldCustom extends JFormattedTextField {
    private int radius = 10;

    public JFormattedTextFieldCustom() {
    }

    public JFormattedTextFieldCustom(Object value) {
        super(value);
    }

    public JFormattedTextFieldCustom(Format format) {
        super(format);
    }

    public JFormattedTextFieldCustom(AbstractFormatter formatter) {
        super(formatter);
    }

    public JFormattedTextFieldCustom(AbstractFormatterFactory factory) {
        super(factory);
    }

    public JFormattedTextFieldCustom(AbstractFormatterFactory factory, Object currentValue) {
        super(factory, currentValue);
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
