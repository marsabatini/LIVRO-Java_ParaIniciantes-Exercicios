/*

    Break com Rótulo.

    Sair de um laço aninhado for.

 */

package Cap_03;

public class Exemplo0022 {
    public static void main (String args[]){

        done:
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    System.out.println(k + " ");
                    if(k == 5)
                        break done; // desvia para o done
                }
                System.out.println("After k loop."); // não será executado
            }
            System.out.println("After j loop."); // não será executado
        }
        System.out.println("After i loop."); // será executado
    }
}
