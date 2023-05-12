package Cap_10.Exemplo0009;

import Cap_10.Exemplo0008.SumArray;

public class MyThread8 implements Runnable{

    Thread thrd;
    static sumArray sa = new sumArray();
    int a[];
    int answer;

    // Constrói uma nova thread.
    MyThread8(String name, int nums[]){
        thrd =new Thread(this, name);
        a = nums;
        thrd.start();   // inicia a Thread
    }

    // Comeca a execucão d nova thread
    public void run(){
        int sum;

        System.out.println(thrd.getName() + " starting.");

        // sincroniza as chamadas a sumArray()
        synchronized(sa){
            answer = sa.sumArray(a);
        }
        System.out.println("Sum for " + thrd.getName() + " is " + answer);
        System.out.println(thrd.getName() + " terminating.");
    }
}
