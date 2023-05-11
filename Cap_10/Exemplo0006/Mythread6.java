package Cap_10.Exemplo0006;

public class Mythread6 implements Runnable{

    Thread thrd;

    // Constrói uma nova thread.
    Mythread6(String name){
        thrd = new Thread(this, name);
        thrd.start();   // inicia a thread
    }

    // Comeca a excecucão da nova thread
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
