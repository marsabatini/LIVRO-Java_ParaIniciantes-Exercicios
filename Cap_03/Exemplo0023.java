/*

    Break com Rótulo

    Importância da posição do rótulo

 */

package Cap_03;

public class Exemplo0023 {
    public static void main (String args[]){

        int x = 0, y = 0;

        // rótulo antes da instrução for
        stop1: for(x = 0 ; x < 5; x++){
            for(y = 0; y < 5; y++){
                if(y == 2)
                    break stop1;
                System.out.println("x and y: " + x + " " + y);
            }
        }

        System.out.println();

        // rótulo imediatamente antes do escopo ({) do for
        for(x = 0; x < 5; x++)
        stop2: {
            for(y = 0; y < 5; y++){
                if(y == 2)
                    break stop2;
                System.out.println("x and y: " + x + " " + y);
            }
        }
    }
}
