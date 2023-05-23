package SwingDesigner.LoginScreenGUI;

import SwingDesigner.CustomComponents.Jframe.JFrameCustom;

import javax.swing.*;
import java.awt.*;

public class LoginScreenGUI extends JFrameCustom {

    public LoginScreenGUI() {
        super("C:\\Users\\pedro\\IdeaProjects\\SmartOracle\\src\\SwingDesigner\\CustomComponents\\Jframe\\AdobeStock_316374161_Preview.jpeg");

        // Obtém o JPanel de fundo
        JPanel contentPanel = getContentPanel();

        setLayout(new GridBagLayout());
        // Configuração do GridBagConstraints
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.9;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 0, 0);

        // Adiciona o JLabel ao JPanel de fundo
        JLabel text = new JLabel("SmartOracle");
        Font font = new Font("Arial", Font.BOLD, 60);
        text.setFont(font);
        text.setForeground(new Color(238, 111, 17)); // Marrom claro
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setVerticalTextPosition(SwingConstants.CENTER);
        add(text,c);

        // Cria o PainelPrincipal
        PainelPrincipal painelPrincipal = new PainelPrincipal();
        painelPrincipal.setBackground(Color.gray);


        c.gridx = 1;
        c.gridy = 0;
        c.insets = new Insets(0,0,0,100);

        add(painelPrincipal,c);

        // Adiciona o contentPanel ao JFrame

        // Torna o JFrame visível
        setVisible(true);
    }

    public static void main(String[] args) {
        // Cria uma instância da classe LoginScreenGUI
        LoginScreenGUI loginScreen = new LoginScreenGUI();
        loginScreen.setExtendedState(MAXIMIZED_BOTH);
    }
}
