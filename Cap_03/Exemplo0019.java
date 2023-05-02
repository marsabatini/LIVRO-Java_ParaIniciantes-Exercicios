/*

    Break encerrando laço infitino

 */

package Cap_03;

public class Exemplo0019 {
    public static void main (String args[])
        throws java.io.IOException{

        char ch;

        // laço infinto até break
        for( ; ; ){
            ch = (char) System.in.read(); // obtém um char
            if(ch == 'q')
                break;
        }
        System.out.println("You pressed q!");
    }
}
