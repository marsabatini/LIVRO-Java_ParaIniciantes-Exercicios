package Cap_09.Exemplo0017;

    // Excecão para erros de fila cheia

public class QueueFullException extends Exception{

    int size;

    QueueFullException(int s){
        size = s;
    }

    public String toString(){
        return "\nQueue is full. Maximum size is " + size;
    }
}
