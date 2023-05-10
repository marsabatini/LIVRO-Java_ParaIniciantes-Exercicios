package Cap_10.Exemplo0004;

    // Cria várias threads

public class MyThread4 implements Runnable{

    Thread thrd;

    MyThread4(String name){
        thrd = new Thread(this, name);
        thrd.start();
    }

    public void run(){
        System.out.println(thrd.getName() + " starting.");

        try{
            for(int count =0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", count is " + count);
            }
        } catch(InterruptedException exception){
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}
