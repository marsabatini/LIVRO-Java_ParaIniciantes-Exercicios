package Cap_10.Exemplo0011;

public class Suspend {

    public static void main(String args[]){

        MyThread ob1 = new MyThread("My Thread");

        try{
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            ob1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            ob1.mysuspend();
            System.out.println("Stopping thread.");
            ob1.mystop();
        } catch(InterruptedException exception){
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread exiting.");
    }
}
