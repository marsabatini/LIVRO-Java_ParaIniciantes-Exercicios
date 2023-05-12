package Cap_10.Exemplo0012;

    /*
        Tente Isto 11-2

        Controlando a thread principal
     */

public class UseMain {

    public static void main(String[] args) {

        Thread thrd;

        // Acessa a thread principal
        thrd = Thread.currentThread();

        // Exibe o nome da thread principal
        System.out.println("Main thread is called: " + thrd.getName());

        // Exibe a prioridade da thread principal
        System.out.println("Priority: " + thrd.getPriority());

        System.out.println();

        // Define nome e prioridade
        System.out.println("Setting name and priority.\n");
        thrd.setPriority(Thread.NORM_PRIORITY+3);

        System.out.println("Main thread is now called: " + thrd.getName());

        System.out.println("Priority is now: " + thrd.getPriority());
    }
}
