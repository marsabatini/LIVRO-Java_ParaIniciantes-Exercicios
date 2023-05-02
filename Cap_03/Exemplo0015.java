/*

    Laço Do-While
    Aguarda o usuário digitar a letra z para sair do laço.

 */

package Cap_03;

public class Exemplo0015 {
    public static void main (String args[])
        throws java.io.IOException{

        char ch;

        do {
            System.out.print("Press a key followed by ENTER: ");
            ch = (char) System.in.read(); // entrada de char
            System.out.println();
        } while (ch != 'z');
    }
}
