package Cap_10.Exemplo0001;

public class UseThreads {

    public static void main(String args[]){
        System.out.println("Main thread starting.");

        // Primeiro, constrói um objeto MyThread
        MyThread mt = new MyThread("Child #1");     // cria um objeto executável

        // Em seguida, constrói uma thread a partir desse obj
        Thread newThrd = new Thread(mt);

        // PAra concluir, comeca a execucão da thread
        newThrd.start();

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
