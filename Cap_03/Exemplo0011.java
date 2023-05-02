/*

    Executa o laço até um S ser digitado.
    Demonstra que o faço for é muito versátil.

*/

package Cap_03;

public class Exemplo0011 {
    public static void main (String args[])
        throws java.io.IOException{

        int i;

        System.out.println("Press S to stop.");

        for (i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Press #" + i);

    }
}
