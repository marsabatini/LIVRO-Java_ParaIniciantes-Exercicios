package Cap_14.Exemplo0001;

// Applet simples baseado em Abstract Window Toolkit(AWT).

import java.awt.*;
import java.applet.*;

@Deprecated
public class SimpleApplet extends Applet{

    public void paint(Graphics g){
        g.drawString("Java makes applets easy.", 20, 20);
    }
}