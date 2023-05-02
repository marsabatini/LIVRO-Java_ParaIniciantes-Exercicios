/*

    Break

    Usa o break; para sair de um laço.

 */

package Cap_03;

public class Exemplo0018 {
    public static void main (String args[]){

        int num;
        num = 100;

        // executa o láço enquanto i ao quadrado é menor do que num
        for(int i = 0; i < num; i++) {
            if (i * i >= num)
                break;
            System.out.print(i + " ");
        }
        System.out.println("Loop complete.");
    }
}
