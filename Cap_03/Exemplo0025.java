/*

    Continue com Rótulo

 */

package Cap_03;

public class Exemplo0025 {
    public static void main (String args[]){

        outerloop:
        for(int i = 1; i < 10; i++){
            System.out.print("\nOuter loop pass " + i + ", Inner Loop: ");
            for(int j = 1; j < 10; j++){
                if(j == 5)
                    continue outerloop; // laço externo do continue.
                System.out.print(j);
            }
        }
    }
}
