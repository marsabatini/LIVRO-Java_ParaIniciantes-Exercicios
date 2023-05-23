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
}
