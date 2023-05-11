package Cap_10.Exemplo0007;

    // Demonstra as prioridades das threads

public class Priority implements Runnable{

    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;

    /*
        Constrói uma nova thread.
        Observe que esse construtor não inicia
        realmente a execucão das threads.
     */
    Priority(String name){
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    // Comeca a execucão da nova Thread.
    public void run(){
        System.out.println(thrd.getName() + " starting.");
        do{
            count++;

            if(currentName.compareTo(thrd.getName()) != 0){
                currentName = thrd.getName();
                System.out.println("In " + currentName);
            }
        } while(stop == false && count < 10000000);

        stop = true;
        System.out.println("\n" + thrd.getName() + " terminating.");
    }
}
