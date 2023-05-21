package Cap_14.Exemplo0002;

// Applet simples baseado em Abstract Window Toolkit(AWT).
// Usa tag APPLET para abrir em HTML.

import java.awt.*;
import java.applet.*;

/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/

@Deprecated
public class SimpleApplet extends Applet{

    public void paint(Graphics g){
        g.drawString("Java makes applets easy.", 20, 20);
    }
}
