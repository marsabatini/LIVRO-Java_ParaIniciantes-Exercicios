package Cap_09.Exemplo0017;

    // Uma excecão para erros de fila vazia

public class QueueEmptyException extends Exception{

    public String toString(){
        return "\nQueue is empty.";
    }
}
