package Cap_10.Exemplo0006;

public class JoinThreads {

    public static void main(String args[]){
        System.out.println("Main thread starting.");

        Mythread6 mt1 = new Mythread6("Child #1");
        Mythread6 mt2 = new Mythread6("Child #2");
        Mythread6 mt3 = new Mythread6("Child #3");

        try{
            mt1.thrd.join();
            System.out.println("Child #1 joined.");

            mt2.thrd.join();
            System.out.println("Child #2 joined.");

            mt3.thrd.join();
            System.out.println("Child #3 joined.");

        } catch(InterruptedException exception){
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread ending.");
    }
}
