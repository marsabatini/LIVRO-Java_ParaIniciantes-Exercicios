package Cap_09.Exemplo0017;

    // Demonstra as excecões de fila
public class QExcDemo {
    public static void main(String args[]){

        FixedQueue q = new FixedQueue(10);
        char ch;
        int i;

        try{
            // excede a fila
            for(i = 0; i < 11; i++){
                System.out.println("Attempting to store: " +
                        (char) ('A' + i));
                q.put((char) ('A' + i));
                System.out.println(" - OK");
            }
            System.out.println();
        } catch (QueueFullException exception){
            System.out.println(exception);
        }
        System.out.println();

        try{
            // tenta acessar um elemento da fila vazia
            for(i = 0; i < 11; i++){
                System.out.println("Getting next char: ");
                ch = q.get();
                System.out.println(ch);
            }
        } catch (QueueEmptyException exception){
            System.out.println(exception);
        }
    }
}
