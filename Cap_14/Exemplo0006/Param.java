package Cap_14.Exemplo0006;

// Passa um parâmetro

import java.awt.*;
import java.applet.*;

/*
<applet code="Param" width=300 height=80>
<param name=author value="Herb Schildt">
<param name=purpose value="Demonstrate Parameters">
<param name=version value=2>
</applet>
*/


/*
@Deprecated
public class Param extends Applet {

    String author;
    String purpose;
    int ver;

    public void start(){
        String temp;

        author = getParameter("author");
        if(author == null)
            purpose = "not found";

        temp = getParameter("version");
        try{
            if(temp != null)
                ver = Integer.parseInt(temp);
            else
                ver = 0;
        } catch(NumberFormatException exc){
            ver = -1;
        }
    }


    public void paint(Ghaphics g){

        g.drawString("Purpose: " + purpose, 10, 20);
        g.drawString("By: " + author, 10, 40);
        g.drawString("Version: " + ver, 10, 60);
    }
}
 */









