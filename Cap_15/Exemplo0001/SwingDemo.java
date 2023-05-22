package Cap_15.Exemplo0001;

    // Programa Swing simples.

import javax.swing.*;

public class SwingDemo {

    SwingDemo(){

        // Cria um conteiner JFrame
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Fornece um tamanho inical para o quadro.
        jfrm.setSize(275, 100);

        // Encerra o programa quando o usuário fechar o aplicativo
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um rótulo baseado em texto.
        JLabel jLabel = new JLabel("Swing defines the modern Java GUI.");

        // Adiciona o rótulo ao painel de conteúdo.
        jfrm.add(jLabel);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        
    }
}
