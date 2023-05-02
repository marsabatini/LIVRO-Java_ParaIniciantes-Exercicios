/*

    Lê um caracter por meio do teclado

 */


package Cap_03;

public class Exemplo0001{
    public static void main (String args[])

            throws java.io.IOException{

        char ch;

        System.out.print("Press a key followed by ENTER: ");

        // lê um caracter no teclado
        ch = (char) System.in.read(); // obtém um char

        System.out.println("Your key is: " + ch);
    }
}
