package Cap_10.Exemplo0008;

public class MyThread7 implements Runnable{

    Thread thrd;
    static SumArray sa = new SumArray();
    int a[];
    int answer;

    // Constrói uma nova thread
    MyThread7(String name, int nums[]){
        thrd = new Thread(this, name);
        a = nums;
        thrd.start();       // inicia a thread
    }

    // Comeca a execucão da nova thread
    public void run(){
        int sum;

        System.out.println(thrd.getName() + " starting.");

        answer = sa.sumArray(a);
        System.out.println("Sum for " + thrd.getName() + " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}
