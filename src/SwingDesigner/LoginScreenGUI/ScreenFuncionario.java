package SwingDesigner.LoginScreenGUI;

import SwingDesigner.CustomComponents.Jframe.JFrameCustom;

import java.awt.*;

public class ScreenFuncionario  extends JFrameCustom {
    public ScreenFuncionario(){
        super("C:\\Users\\pedro\\IdeaProjects\\SmartOracle\\src\\SwingDesigner\\CustomComponents\\Jframe\\AdobeStock_316374161_Preview.jpeg");
        setLayout(new BorderLayout());

        painecadastro p = new painecadastro();
        add(p,BorderLayout.WEST);
        getContentPanel().setPreferredSize(new Dimension(getContentPanel().getPreferredSize().width,200));
        add(getContentPanel(),BorderLayout.NORTH);



        setVisible(true);
    }

    public static void main(String[] args) {
        ScreenFuncionario screenFuncionario = new ScreenFuncionario();
        screenFuncionario.setExtendedState(MAXIMIZED_BOTH);
    }
}
