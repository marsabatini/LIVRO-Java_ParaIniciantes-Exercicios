package Cap_10.Exemplo0011;

public class MyThread implements Runnable{

    Thread thrd;

    boolean suspended;
    boolean stopped;

    MyThread(String name){
        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();
    }

    public void run(){
        System.out.println(thrd.getName() + " starting.");

        try{
            for(int i = 0; i < 1000; i++){
                System.out.print(i + " ");
                if((i % 10) == 0){
                    System.out.println();
                    Thread.sleep(250);
                }

                // Usa um bloco sincronizado para verificar suspended e stopped
                synchronized (this){
                    while (suspended)
                        wait();
                }
                if(stopped)
                    break;
            }
        } catch(InterruptedException exception){
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " exiting.");
    }

    // Encerra a thread
    synchronized void mystop(){
        stopped = true;

        // O código a seguir assegura que uma thread suspensa possa ser encerrada.
        suspended = false;
        notify();
    }

    // Suspende a thread
    synchronized void mysuspend(){
        suspended = true;
    }

    // Retoma a thread
    synchronized void myresume(){
        suspended = false;
        notify();
    }
}
