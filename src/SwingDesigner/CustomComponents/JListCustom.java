package SwingDesigner.CustomComponents;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class JListCustom<E> extends JList<E> {
    private int radius = 10;
    public JListCustom(ListModel<E> dataModel) {
        super(dataModel);
        setOpaque(false);
    }

    public JListCustom(E[] listData) {
        super(listData);
        setOpaque(false);
    }

    public JListCustom(Vector<? extends E> listData) {
        super(listData);
        setOpaque(false);
    }

    public JListCustom() {
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
        g2.setColor(Color.BLACK);
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
