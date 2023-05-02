package Cap_05;


    // Exemplo do uso de laço for-each

public class Exemplo0012 {

    public static void main (String args[]){

        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Usa o laço for-each para exibir e somar os valores
        for(int x: nums){
            System.out.println("Value is: " + x);
            sum += x;
        }

        System.out.println("Summation: " + sum);
    }
}
