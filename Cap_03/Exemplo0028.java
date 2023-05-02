/*

    Programa lê caracteres até o ponto e conta os espaços

 */

package Cap_03;

public class Exemplo0028 {
    public static void main (String args[])
    throws java.io.IOException{

        char ch;
        int spaces = 0;

        System.out.println("Enter a period to stop.");

        do {
            ch = (char) System.in.read();
            if (ch == ' ')
                spaces++;
        } while (ch != '.');

        System.out.println("Spaces: " + spaces);
    }
}
