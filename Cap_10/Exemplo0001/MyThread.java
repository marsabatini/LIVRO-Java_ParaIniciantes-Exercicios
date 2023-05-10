package Cap_10.Exemplo0001;

    // Cria uma thread implementando Runnable
public class MyThread implements Runnable{

    String thrdName;

    MyThread(String name){
        thrdName = name;
    }

    // Ponto de entrada da thread.
    public void run(){
        System.out.println(thrdName + " starting.");

        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println("In " + thrdName + ", count is " + count);
            }
        } catch(InterruptedException exception){
            System.out.println(thrdName + " interrupted.");
        }
        System.out.println(thrdName + " interrupted.");
    }
}
