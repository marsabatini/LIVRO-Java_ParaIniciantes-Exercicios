package Cap_10.Exemplo0004;

public class MoreThreads {

    public static void main(String args[]){
        System.out.println("Main thread starting.");

        MyThread4 mt1 = new MyThread4("Child #1");
        MyThread4 mt2 = new MyThread4("Child #2");
        MyThread4 mt3 = new MyThread4("Child #3");

        for(int i = 0; i < 50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            } catch(InterruptedException exception){
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}
