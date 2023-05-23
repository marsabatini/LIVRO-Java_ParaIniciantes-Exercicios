package Cap_15.Exemplo0007;

// Applet simples baseado em Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
    Esta HTML podia ser usada para iniciar o applet:

    <applet cpde="MySwingApplet" width=200 height=80>
    <applet/>
 */

@Deprecated
public class MySwingApplet extends JApplet{

    JButton jbtnUp;
    JButton jbtnDown;

    JLabel jLabel;

    // Iniciava o applet
    public void init(){
        try{
            SwingUtilities.invokeAndWait(new Runnable() {
                @Override
                public void run() {
                    makeGUI();
                }
            });
        } catch(Exception exception){
            System.out.println("Can't create because of " + exception);
        }
    }

    // Esse applet não precisava sobrepor start(), stop() e destroy()
    private void makeGUI(){

        JFrame jFrame = new JFrame("Applet");
        jFrame.setLayout(new FlowLayout());

        jbtnUp = new JButton("Up");
        jbtnDown = new JButton("Down");

        jbtnUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                jLabel.setText("You pressed down.");
            }
        });

        jFrame.add(jbtnUp);
        jFrame.add(jbtnDown);

        jLabel = new JLabel("Press a button");

        jFrame.add(jLabel);

    }
}
