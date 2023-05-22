package Cap_15.Exemplo0004;

    // Demonstra caixas de selećão

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CBDemo implements ItemListener {

    JLabel jlabSelected;
    JLabel jlabChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;

    CBDemo(){

        // Cria um contêiner JFrame
        JFrame jfrm = new JFrame("Demonstrate Check Boxes");

        // Especifica FlowLayout como gerenciador.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(280, 120);

        // Encerra o programa quando o usuário fecha o aplicativo
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria rótulos vazios.
        jlabSelected = new JLabel("");
        jlabChanged = new JLabel("");

        // Cria caixas de selećão.
        jcbAlpha = new JCheckBox("Alpha");
        jcbBeta = new JCheckBox("Beta");
        jcbGamma = new JCheckBox("Gamma");

        // Eventos gerados pelas caixas de selećão
        // são tratados pelo método itemStateChanged()
        // implementado por CBDemo
        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);

        // Adiciona as caixas de selećão e rótulos ao painel de conteúdo
        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jlabChanged);
        jfrm.add(jlabSelected);

        // Exibe o quadro
        jfrm.setVisible(true);
    }

    // Esse é o tratador das caixas de selećão
    public void itemStateChanged(ItemEvent ie){

        String str = "";

        // Obtém uma referência à caixa de selećão que causou o evento
        JCheckBox cb = (JCheckBox) ie.getItem();

        // Relata que caixa de selećão mudou
        if(cb.isSelected())
            jlabChanged.setText(cb.getText() + " was just selected.");
        else
            jlabChanged.setText(cb.getText() + " was just cleared.");

        // Relata todas as caixas selecionadas
        if(jcbAlpha.isSelected()){
            str += "Alpha";
        }
        if(jcbBeta.isSelected()){
            str += "Beta";
        }
        if(jcbGamma.isSelected()){
            str += "Gamma";
        }

        jlabSelected.setText("Selected check boxes: " + str);
    }

    public static void main(String args[]){

        // Cria o quadro na thread de despacho de evento.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CBDemo();
            }
        });
    }
}
