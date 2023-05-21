package Cap_14.Exemplo0007;

    // Demonstra os tratadores de eventos do mouse.

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<aplet code="MouseEvents" width=300 height=100>
</applet>
 */

/*
@Deprecated
public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{

    String msg = "";
    int mouseX = 0, mouseY = 0;

    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // tratava de cliques no mouse
    public void mouseClicked(MouseEvent me){
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked";
        repaint();
    }

    // tratava da entrada do mouse na janela
    public void mouseEntered(MouseEvent me){
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered";
        repaint();
    }

    // tratava da saída do mouse na janela
    public void mouseExited(MouseEvent me){
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse exited";
        repaint();
    }

    // tratava o posicionamento de botão
    public void mousePressed(MouseEvent me){
        // salvava as coordenadas
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }

    // tratava da solutra do botão
    public void mouseReleased(MouseEvent me){
        // salvava as coordenadas
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Up";
        repaint();
    }

    // tratava o mouse sendo arrastado
    public void mouseDragged(MouseEvent me){
        // salvava as coordenadas
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
    }

    // tratava o mouse sendo movido
    public void mouseDragged(MouseEvent me){
        // exibia as coordenadas
        showStatus("Moving mouse at " + me.getX() + ", " + me.getY());
        repaint();
    }

    // exibia a msg na janela do applet no local (x, y) atual
    public void paint(Graphics g){
        g.drawString(msg, mouseX, mouseY);
    }
}

 */
