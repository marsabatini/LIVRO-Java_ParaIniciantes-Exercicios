/*
    1.0
    Adivinhe a letra do jogo.

 */


package Cap_03;

public class Exemplo0002 {
    public static void main (String args[])
        throws java.io.IOException{

        char ch, answer = 'K';

        System.out.println("Iḿ thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read(); // lê um char no teclado

        if (ch == answer)
            System.out.println("** RIGHT **");

    }
}
