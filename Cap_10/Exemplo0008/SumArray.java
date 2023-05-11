package Cap_10.Exemplo0008;

    // Usa a sincronizacão para controlar o acesso.

public class SumArray {

    private int sum;

    synchronized int sumArray(int nums[]){
        sum = 0;  //redefine sum

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];

            System.out.println("Running total for " + Thread.currentThread().getName() + " is " + sum);

            try{
                Thread.sleep(10);   // permite a alternância de tarefas
            } catch(InterruptedException exception){
                System.out.println("Thread intererrupted");
            }
        }
        return sum;
    }
}
