/*

    3.0
    Adivinhe a letra do jogo

 */

package Cap_03;

public class Exemplo0004 {
    public static void main (String args[])
        throws java.io.IOException{

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read();

        if (ch == answer)
                System.out.println("** Right **");
        else {
            System.out.print("... Sorry, you're ");

            // if aninhado
            if (ch < answer)
                System.out.println("too low");
            else
                System.out.printf("too high");
        }
    }
}
