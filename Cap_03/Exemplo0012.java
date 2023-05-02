/*

    Corpo do laço está vazio.

 */


package Cap_03;

public class Exemplo0012 {
    public static void main (String args[]){

        int i;
        int sum = 0;

        //soma os números até 5
        for (i = 1; i <= 5; sum += i++){ // não há corpo no laço
            System.out.println("Sum is " + sum);
        }
    }
}
