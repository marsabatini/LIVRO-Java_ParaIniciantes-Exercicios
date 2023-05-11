package Cap_10.Exemplo0005;

public class MoreThreads2 {

    public static void main(String args[]){

        System.out.println("Main thread starting.");

        MyThread5 mt1 = new MyThread5("Child #1");
        MyThread5 mt2 = new MyThread5("Child #2");
        MyThread5 mt3 = new MyThread5("Child #3");

        do{
            System.out.print(".");
            try{
                Thread.sleep(100);
            } catch(InterruptedException exception){
                System.out.println("Main thread interrupted");
            }
        } while(mt1.thrd.isAlive() || mt2.thrd.isAlive() || mt3.thrd.isAlive());

        System.out.println("Main tread ending.");
    }
}
