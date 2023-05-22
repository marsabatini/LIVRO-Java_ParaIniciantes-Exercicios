package Cap_15.Exemplo0002;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonDemo {

    ButtonDemo(){

        // Cria um conteiner JFrame
        JFrame jfrm = new JFrame("A Button Example");

        // Especifica FlowLayout como gerenciador
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inical para o quadro.
        jfrm.setSize(220, 90);

        // Encerra o programa quando o usuário fechar o aplicativo
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria dois botões.
        JButton jButtonUp = new JButton("Up");
        JButton jButtonDown = new JButton("Down");

        // Adiciona ouvintes de aćão
        jButtonUp.addActionListener((ActionListener) this);
        jButtonDown.addActionListener((ActionListener) this);

        // Adiciona os botões ao painel de conteúdo.
        jfrm.add(jButtonUp);
        jfrm.add(jButtonDown);

        // Cria um rótulo.
        JLabel jlab = new JLabel("Press a button");

        // Adiciona o rótulo ao quadro.
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }
}
