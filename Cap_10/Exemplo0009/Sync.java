package Cap_10.Exemplo0009;

public class Sync {

    public static void main(String args[]){
        int a[] = { 1, 2, 3, 4, 5 };

        MyThread8 mt1 = new MyThread8("Child #1", a);
        MyThread8 mt2 = new MyThread8("Child #2", a);

        try{
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exception){
            System.out.println("Main thread interrupted.");
        }
    }
}
