package Cap_15.Exemplo0006;

    /*
        Tente Isto 16-1

        Utilitário de comparaćão de arquivos baseado em Swing.
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

    SwingFC(){

        JFrame jfrm = new JFrame("Compare File");

        jfrm.setLayout(new FlowLayout());

        jfrm.setSize(200, 190);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        jtfFirst.setActionCommand("fileA");
        jtfSecond.setActionCommand("fileB");

        JButton jbtnComp = new JButton("Compare");

        jbtnComp.addActionListener(this);

        jlabFirst = new JLabel("First file: ");
        jlabSecond = new JLabel("Second file: ");
        jlabResult = new JLabel("");

        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        jfrm.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        int i = 0, j = 0;

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
            } while(i != -1 && j != -1);

            if(i != j){
                jlabResult.setText("Files are not the same.");
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
