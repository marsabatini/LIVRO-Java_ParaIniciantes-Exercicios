package Cap_10.Exemplo0003;

    /*
        Tente isto 11-1

        Estende thread
     */

public class MyThread3 extends Thread {

    MyThread3(String name){
        super(name);
        start();
    }

    public void run(){
        System.out.println(getName() + " starting.");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + getName() + ", count is " + count);
            }
        } catch(InterruptedException exception){
            System.out.println(getName() + " interrupted.");
        }
        System.out.println(getName() + " terminating.");
    }
}
