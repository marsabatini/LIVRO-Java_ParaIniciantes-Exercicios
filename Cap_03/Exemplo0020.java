/*

    Break em Laços Aninhados

 */

package Cap_03;

public class Exemplo0020 {
    public static void main (String args[]){

        for(int i = 0; i < 3; i++){
             System.out.println("Outer loop count: " + i);
             System.out.print("\t Inner loop count: ");

             int t = 0;
             while (t < 100){
                 if(t == 10) // encerra o laço se t for igual a 10
                     break;
                 System.out.print(t + " ");
                 t++;
            }
            System.out.println();
        }
        System.out.println("Loops complete.");
    }
}
