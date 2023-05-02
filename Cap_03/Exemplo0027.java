/*

    Laços Aninhados

    Programa encontra os fatores dos números de 2 a 100.

 */

package Cap_03;

public class Exemplo0027 {
    public static void main (String args[]){

        for(int i = 2; i <= 100; i++){
            System.out.print("Factors of " + i + ": ");
            for(int j = 2; j < i; j++){
                if((i % j == 0))
                    System.out.print(j + " \n");
            }
        }
    }
}
