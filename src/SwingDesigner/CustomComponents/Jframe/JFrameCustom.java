package SwingDesigner.CustomComponents.Jframe;

import javax.swing.*;
import java.awt.*;

public class JFrameCustom extends JFrame {
    private final Image backgroundImage;
    private JPanel contentPanel;

    public JFrameCustom(String uri) {
        // Carrega a imagem de fundo
        backgroundImage = new ImageIcon(uri).getImage();
        // Configura o tamanho inicial do JFrame
        setSize(800, 600);
        // Centraliza o JFrame no meio da tela
        setLocationRelativeTo(null);
        // Define o comportamento padrão de fechar o JFrame ao clicar no botão "X"
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um JPanel personalizado para desenhar a imagem de fundo
        setContentPanel(new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Desenha a imagem de fundo ajustada ao tamanho do JPanel
                g.drawImage(getBackgroundImage(), 0, 0, getWidth(), getHeight(), this);
            }
        });


    }

    @Override
    public Dimension getPreferredSize() {
        // Retorna a dimensão preferencial baseada no tamanho da imagem de fundo
        return new Dimension(getBackgroundImage().getWidth(this), getBackgroundImage().getHeight(this));
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }

    public Image getBackgroundImage() {
        return backgroundImage;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }
}
