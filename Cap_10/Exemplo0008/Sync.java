package Cap_10.Exemplo0008;

public class Sync {

    public static void main(String args[]){

        int a[] = { 1, 2, 3, 4, 5 };

        MyThread7 mt1 = new MyThread7("Child #1", a);
        MyThread7 mt2 = new MyThread7("Child #2", a);

        try{
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exception){
            System.out.println("Main thread interrupted");
        }
    }
}
