package Cap_02;/*

    Demonstra o tempo de vida de uma variável

 */

public class Exemplo0017 {
    public static void main (String args[]){

        int x;

        for(x = 0 ; x < 3; x++){

            // y será inicializada sempre que entrarmos no bloco
            int y = -1;

            // essa linha sempre exibe -1
            System.out.println("y is: " + y);

            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
