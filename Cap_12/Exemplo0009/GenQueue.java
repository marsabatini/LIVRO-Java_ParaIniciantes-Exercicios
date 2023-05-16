package Cap_12.Exemplo0009;

    // Classe genérica de fila de tamanho fixo.

public class GenQueue <T> implements IGenQ<T>{

    private T q[];      // esse array contém a fila
    private int putloc, getloc; // índices de inserćão e retirada

    // Constrói uma fila vazia com o array dado
    public GenQueue(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }

    // Insere um item na fila
    public void put(T obj) throws QueueFullException{
        if(putloc == q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = obj;
    }

    // Retira um item da fila.
    public T get() throws QueueEmptyException{
        if(getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}
