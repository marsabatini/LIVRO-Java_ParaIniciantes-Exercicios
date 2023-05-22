package Cap_15.Exemplo0003;

// Usa um campo de Texto

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TFDemo implements ActionListener {

    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemo() {

        // Cria um contêiner JFrame
        JFrame jfrm = new JFrame("Use a Text Field.");

        // Especifica FlowLayout como gerenciador.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro
        jfrm.setSize(240, 120);

        // Encerra o programa quando o usuário fechar o programa.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria um ampo de texto
        jtf = new JTextField(10);

        // Define os comandos de aćão do campo de texto
        jtf.setActionCommand("myTF");

        // Cria o botão Reverse
        jbtnRev = new JButton("Reverse");

        // Adiciona ouvintes de aćão
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        // Cria os rótulos
        jlabPrompt = new JLabel("Enter text: ");
        jlabContents = new JLabel("");

        // Adiciona os componentes ao painel de conteúdo
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        // Exibe o quadro
        jfrm.setVisible(true);
    }

    // Trata eventos de aćão
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Reverse")) {
            // O botão reverse foi pressionado
            String orgStr = jtf.getText();
            String resStr = "";

            // Inverte a string do campo de texto
            for (int i = orgStr.length() - 1; i >= 0; i--) {
                resStr += orgStr.charAt(i);
            }

            // Armazena a string invertida no campo de texto
            jtf.setText(resStr);
        } else {
            // Enter foir pressionado enquanto o foco estava no campo de texto
            jlabContents.setText("You pressed ENTER. Text is: " + jtf.getText());
        }
    }

    public static void main(String[] args) {

        // Cria o quadro na thread de despacho do evento.
        SwingUtilities.invokeLater((new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        }));
    }
}
