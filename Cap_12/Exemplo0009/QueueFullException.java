package Cap_12.Exemplo0009;

    // Excećão para erros de fila cheia

public class QueueFullException extends Exception{

    int size;
    QueueFullException(int s) {
        size = s;
    }

    public String toString(){
        return "\nQueue is full. Maximum size is" + size;
    }
}
