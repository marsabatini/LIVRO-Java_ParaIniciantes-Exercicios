package Cap_05;

    // O laço for-each é somente leitura

public class Exemplo0013 {

    public static void main (String args[]){

        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for(int x: nums){
            System.out.print(x + " ");
            x = x * 10;     // Essa operação não tem efeito sobre nums[]
        }

        System.out.println();

        for(int x: nums){
            System.out.print(x + " ");
        }

        System.out.println();
    }
}
