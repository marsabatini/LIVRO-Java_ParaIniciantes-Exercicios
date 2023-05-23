package Cap_15.Exemplo0005;

    // Demonstra uma JList simples

import Cap_12.Exemplo0005.D;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class ListDemo implements ListSelectionListener{

    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;

    // Cria um array de nomes
    String names[] = { "Sherry", "Jon", "Rachel",
                    "Sasha", "Josselyn", "Randy",
                    "Tom", "Mary", "Ken",
                    "Andrew", "Matt", "Todd" };

    ListDemo(){

        // Cria um contêiner JFrame
        JFrame jfrm = new JFrame("List Demo");

        // Especifica um layout de fluxo.
        jfrm.setLayout(new FlowLayout());

        // Fornece um tamanho inicial para o quadro.
        jfrm.setSize(200, 160);

        // Encerra o programa quando o usuário fechar o aplicativo.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria uma JList
        jlst = new JList<String>(names);

        // Define o modo de selećão da lista como selećão simples
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Adiciona a lista a uma painel de rolagem
        jscrlp = new JScrollPane(jlst);

        // Define um tamanho para o painel de rolagem
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // Cria um rótulo para exibir a selećão
        jlab = new JLabel("Please, choose a name.");

        // Adiciona o tratador da selećão
        jlst.addListSelectionListener(this);

        // Adiciona a lista e o rótulo ao painel de conteúdo
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // Exibe o quadro.
        jfrm.setVisible(true);
    }

    // Trata eventos de selećão da lista
    public void valueChanged(ListSelectionEvent le){

        // Obtém o índice do item alterado.
        int idx = jlst.getSelectedIndex();

        // Exibe a selećão, se um item for selecionado.
        if(idx != -1){
            jlab.setText("Current selection: " + names[idx]);
        } else {
            jlab.setText("Please, choose a name.");
        }
    }

    public static void main(String args[]){

        // Cria o quadro na thread de desepacho de evento
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
