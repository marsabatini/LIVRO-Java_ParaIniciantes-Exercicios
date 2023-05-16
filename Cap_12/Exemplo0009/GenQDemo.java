package Cap_12.Exemplo0009;

    /*
        Tente Isto 13-1

        Demonstra uma classe genérica de fila.
     */

public class GenQDemo {

    public static void main(String[] args) {

        // Cria uma fila de inteiros
        Integer iStore[] = new Integer[10];
        GenQueue<Integer> q = new GenQueue<Integer>(iStore);

        Integer iVal;

        System.out.println("Demonstrate a queue of Integers.");
        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Adding " + i + " to q.");
                q.put(i);       // adicona o valor inteiro à q Código
            }
        } catch(QueueFullException exception){
            System.out.println(exception);
        }
        System.out.println();

        try{
            for(int i = 0; i < 5; i++){
                System.out.print("Getting next integer from q: ");
                iVal = q.get();
                System.out.println(iVal);
            }
        } catch(QueueEmptyException exception){
            System.out.println(exception);
        }

        System.out.println();

        // Cria uma fila Double
        Double dStore[] = new Double[10];
        GenQueue<Double> q2 = new GenQueue<Double>(dStore);

        Double dVal;

        System.out.println("Demonstrate a queue of Doubles.");
        try{
            for(int i = 0; i < 5; i++){
                System.out.println("Adding " + (double) i / 2 + " to q2.");
                q2.put((double) i/2);       // adiciona um valor double à q
            }
        } catch(QueueFullException exception){
            System.out.println(exception);
        }
        System.out.println();

        try{
            for(int i = 0; i < 5; i++){
                System.out.print("Getting next Double from q2: ");
                dVal = q2.get();
                System.out.println(dVal);
            }
        } catch(QueueEmptyException exception){
            System.out.println(exception);
        }
    }
}
