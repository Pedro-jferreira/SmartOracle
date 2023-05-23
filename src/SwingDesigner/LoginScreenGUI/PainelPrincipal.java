package SwingDesigner.LoginScreenGUI;

import SwingDesigner.CustomComponents.JButtonCustom;
import SwingDesigner.CustomComponents.JPasswordFieldCustom;
import SwingDesigner.CustomComponents.JTextFieldCustom;

import javax.swing.*;
import java.awt.*;

public class PainelPrincipal extends JPanel {

    private PaintMenu painelInterno;
    public PainelPrincipal(){
        this.painelInterno = new PaintMenu();

        setLayout(new BorderLayout());

        painelInterno.setOpaque(false);
        painelInterno.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();


        JLabel label = new JLabel("Fazer Login:");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBackground(Color.darkGray);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx=0;
        c.weightx = 0.5;
        c.ipady=0;
        c.gridheight=2;
        c.insets = new Insets(10,0,20,10);
        c.gridx = 0;
        c.gridy = 0;
        painelInterno.add(label, c);
        //-------------------------------------

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setOpaque(false);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setOpaque(false);
        //-------------------------------------

        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx=0;
        c.weightx = 0.5;
        c.ipady=0;
        c.gridheight=2;
        c.insets = new Insets(0,10,20,10);
        c.gridx = 0;
        c.gridy = 0;


        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setForeground(Color.DARK_GRAY);
        labelUsuario.setHorizontalAlignment(SwingConstants.CENTER);


        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setForeground(Color.DARK_GRAY);
        labelSenha.setHorizontalAlignment(SwingConstants.CENTER);

        panel1.add(labelUsuario,c);
        panel2.add(labelSenha,c);
//=------------------------------------------------------


        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx=0;
        c.weightx = 0.5;
        c.ipady=0;
        c.gridheight=2;
        c.insets = new Insets(10,0,20,10);
        c.gridx = 1;
        c.gridy = 0;

        JTextFieldCustom textFieldUsuario = new JTextFieldCustom(30);
        textFieldUsuario.setPreferredSize(new Dimension(textFieldUsuario.getPreferredSize().width,40));


        JPasswordFieldCustom passwordFieldSenha = new JPasswordFieldCustom(30);
        passwordFieldSenha.setPreferredSize(new Dimension(passwordFieldSenha.getPreferredSize().width,40));

        panel1.add(textFieldUsuario,c);
        panel2.add(passwordFieldSenha,c);

        //-----------------------------


        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx=0;
        c.weightx = 0.5;
        c.ipady=0;
        c.gridheight=2;
        c.insets = new Insets(0, 0, 0, 0);
        c.gridx = 0;
        c.gridy = 2;

        painelInterno.add(panel1,c);

        c.gridx = 0;
        c.gridy = 4;

        painelInterno.add(panel2,c);


        JButtonCustom button = new JButtonCustom("Login->");
        button.setColors(Color.darkGray, Color.LIGHT_GRAY, Color.BLACK);
        button.setForeground(Color.white);
        button.setPreferredSize(new Dimension(100,40));
        c.fill = GridBagConstraints.NONE;
        c.ipadx=0;
        c.weightx = 0.5;
        c.ipady=0;
        c.gridheight=2;
        c.insets = new Insets(10,0,0,10);
        c.gridx = 0;
        c.gridy = 6;
        painelInterno.add(button, c);



        setbackground(new Color(232, 103, 2));
        painelInterno.setBackground(getBackground());
        add(painelInterno,BorderLayout.CENTER);
        setOpaque(false);

        setVisible(true);


    }

    public PaintMenu getPainelInterno() {
        return painelInterno;
    }

    public void setPainelInterno(PaintMenu painelInterno) {
        this.painelInterno = painelInterno;
    }


    public void setbackground(Color bg) {
        painelInterno.setBackground(bg);
        setBackground(bg);
    }
}
