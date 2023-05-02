package Cap_05;

public class Exemplo0004 {

    public static void main (String[] args){

        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};

        int a, b, t;
        int size;

        // número de elementos a serem classificados;
        size = 10;

        // exibe o array original
        System.out.print("Original array is: ");
        for(int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);

        System.out.println();

        for(a = 1; a < size; a++){
            for(b = size - 1; b >= a; b--){

                // se estiver fora de ordem
                if(nums[b - 1] > nums[b]){

                    // troca os elementos
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        // exibe o array classificado
        System.out.print("Sorted array is: ");
        for(int i = 0; i < size; i++){
            System.out.print(" " + nums[i]);
        }

        System.out.println();
    }
}
