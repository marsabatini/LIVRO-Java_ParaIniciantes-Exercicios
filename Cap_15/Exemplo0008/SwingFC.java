package Cap_15.Exemplo0008;

 /*
        Tente Isto 16-2

        Utilitário de comparaćão de arquivos baseado em Swing.

        Esta versão tem uma caixa de selećão que faz o
        local da primeira discrepância ser exibido.
     */

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.IOException;

public class SwingFC implements ActionListener{

    JTextField jtfFirst;
    JTextField jtfSecond;

    JButton jbtnComp;

    JLabel jlabFirst, jlabSecond;
    JLabel jlabResult;

    JCheckBox jcbLoc;

    SwingFC(){

        JFrame jfrm = new JFrame("Compare File");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(200, 220);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        jbtnComp = new JButton("Compare");

        jbtnComp.addActionListener(this);

        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");

        // Cria a caixa de selećão
        jcbLoc = new JCheckBox("Show position of mismatch");

        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jcbLoc);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        int i = 0, j = 0;
        int count = 0;

        if(jtfFirst.getText().equals("")){
            jlabResult.setText("First file name missing.");
            return;
        }

        if(jtfSecond.getText().equals("")){
            jlabSecond.setText("Second file name missing.");
            return;
        }

        try(FileInputStream f1 = new FileInputStream(jtfFirst.getText());
            FileInputStream f2 = new FileInputStream(jtfSecond.getText())){
            do{
                i = f1.read();
                j = f2.read();
                if(i != j)
                    break;
                count++;
            } while(i != -1 && j != -1);

            if(i != j){
                if(jcbLoc.isSelected()){
                    jlabResult.setText("Files differ at location." + count);
                } else {
                    jlabResult.setText("Files are not the same.");
                }
            } else
                jlabResult.setText("Files compare equal.");
        } catch(IOException exc){
            jlabResult.setText("File error.");
        }
    }

    public static void main(String args[]){

        SwingUtilities.invokeLater((new Runnable() {
            @Override
            public void run() {
                new SwingFC();
            }
        }));
    }
}