package SwingDesigner.LoginScreenGUI;

import SwingDesigner.CustomComponents.JButtonCustom;

import javax.swing.*;
import java.awt.*;

public class painecadastro extends JPanel {
    private PaintMenu painelInterno;

    JButtonCustom[] buttons;
    String[] text = {"usuarios->","Livros->","Emprestimos->","reservas"};
    public painecadastro(){

        this.painelInterno = new PaintMenu();
        this.buttons = new JButtonCustom[text.length];
        setLayout(new BorderLayout());
        painelInterno.setOpaque(false);
        painelInterno.setLayout(new GridBagLayout());

        Inicializar(buttons);
        setTextButton(buttons, text);
        setColorButtos(buttons);



        GridBagConstraints c = new GridBagConstraints();

        c.fill = GridBagConstraints.NONE;
        c.ipadx=0;
        c.weightx = 0.5;
        c.ipady=0;
        c.gridheight=2;
        c.insets = new Insets(10,10,10,10);
        c.gridx = 0;
        c.gridy = 0;
        painelInterno.add(buttons[0], c);
        c.gridx = 0;
        c.gridy = 2;
        painelInterno.add(buttons[1],c);
        c.gridx = 0;
        c.gridy =4;
        painelInterno.add(buttons[2],c);
        c.gridx = 0;
        c.gridy =6;
        painelInterno.add(buttons[3],c);





        setbackground(new Color(232, 103, 2));
        painelInterno.setBackground(getBackground());
        add(painelInterno,BorderLayout.CENTER);
        setOpaque(false);

        setVisible(true);



    }
    private void setTextButton(JButtonCustom[] buttons,String[] texts){
        int count=0;
        for (JButtonCustom b:buttons) {
            b.setText(text[count]);
            count++;
        }
    }
    private void setColorButtos(JButtonCustom[] bts){
        for (JButtonCustom b:bts) {
            b.setColors(Color.GRAY,Color.LIGHT_GRAY,Color.DARK_GRAY);
            b.setPreferredSize(new Dimension(200,60));
        }
    }
    private void Inicializar(JButtonCustom[] jb){
        for (int i = 0; i <jb.length ; i++) {
            jb[i] = new JButtonCustom("oi");
            jb[i].setVisible(true);

        }

    }
    public void setbackground(Color bg) {
        painelInterno.setBackground(bg);
        setBackground(bg);
    }
}
