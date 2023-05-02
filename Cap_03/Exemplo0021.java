/*

    Break com Rótulo

    Exemplo com blocos aninhados.

 */

package Cap_03;

public class Exemplo0021 {
    public static void main (String args[]){

        int i;

        for(i = 1; i < 4; i++){
            one: {
                two: {
                    three: {
                    System.out.println("\ni is " + i);
                    if(i == 1)
                        break one;
                    if(i == 2)
                        break two;
                    if(i == 3)
                        break three;

                    // Essa parte nunca será alcançada
                        System.out.println("Wont'n print!");
                    }
                    System.out.println("After block three.");
                }
                System.out.println("After block two.");
            }
            System.out.println("After block one.");
        }
        System.out.println("After for.");
    }
}
