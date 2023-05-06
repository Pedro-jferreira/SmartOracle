package SwingDesigner.CustomComponents;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JButtonCustom extends JButton{

    private  Color backgroundcolor,clicked,entered;

    public JButtonCustom() {
        this.backgroundcolor = Color.darkGray;
        this.clicked = Color.black;
        this.entered= Color.gray;
        setForeground(Color.lightGray);
        setCustomConfig();
    }

    public JButtonCustom(Icon icon) {
        super(icon);
        this.backgroundcolor = Color.darkGray;
        this.clicked = Color.black;
        this.entered= Color.gray;
        setForeground(Color.lightGray);
        setCustomConfig();
    }

    public JButtonCustom(String text) {
        super(text);
        this.backgroundcolor = Color.darkGray;
        this.clicked = Color.black;
        this.entered= Color.gray;
        setForeground(Color.lightGray);
        setCustomConfig();
    }

    public JButtonCustom(Action a) {
        super(a);
        this.backgroundcolor = Color.darkGray;
        this.clicked = Color.black;
        this.entered= Color.gray;
        setForeground(Color.lightGray);
        setCustomConfig();
    }

    public JButtonCustom(String text, Icon icon) {
        super(text, icon);
        this.backgroundcolor = Color.darkGray;
        this.clicked = Color.black;
        this.entered= Color.gray;
        setForeground(Color.lightGray);
        setCustomConfig();
    }

    private void setCustomConfig() {
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(5,0,5,0));
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setBackground(getClicked());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(getClicked());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(getBackground());
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(getEntered());

            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(getBackground());
            }
        });

    }

    public void setColors(Color background,Color entered, Color clicked){
        this.clicked = clicked;
        this.backgroundcolor = background;
        this.entered=entered;
        setBackground(background);
    }


    @Override
    public Color getBackground() {
        return super.getBackground();
    }

    @Override
    public void setBackground(Color bg) {
        this.backgroundcolor=bg;
        super.setBackground(this.backgroundcolor);
    }
    public Color getClicked() {
        return clicked;
    }

    public Color getEntered() {
        return entered;
    }

    @Override
    public void setSize(Dimension d) {
        super.setSize(d);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 30, 30);
        super.paintComponent(g);
    }

}

