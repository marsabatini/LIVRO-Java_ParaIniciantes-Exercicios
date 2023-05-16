package Cap_12.Exemplo0009;

    // Excećão para erros de fila vazia
public class QueueEmptyException extends Exception{

    public String toString(){
        return "\nQueue is empty.";
    }

}
