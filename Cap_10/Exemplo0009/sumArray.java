package Cap_10.Exemplo0009;

    // Usa um bloco sincronizado para controlar o acesso a sumArray

public class sumArray {

    private int sum;

    int sumArray(int nums[]){
        sum = 0;        // redefine sum

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try{
                Thread.sleep(10);  // permimte a alternância de taregas
            } catch(InterruptedException exception){
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}
