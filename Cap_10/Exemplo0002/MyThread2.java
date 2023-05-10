package Cap_10.Exemplo0002;

    // MyThread refatorada

import Cap_10.Exemplo0001.MyThread;

public class MyThread2 implements Runnable{

    Thread thrd;

    MyThread2(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        System.out.println(thrd.getName() + " starting.");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch(InterruptedException exception){
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
