package Cap_10.Exemplo0002;

public class UseThreadsImproved {

    public static void main(String args[]){

        System.out.println("Main thread starting.");

        MyThread2 mt = new MyThread2("Child #1");

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
