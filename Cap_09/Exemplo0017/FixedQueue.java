package Cap_09.Exemplo0017;

    /*
        Classe de fila de tamanho fixo que usa excecões para
        caracteres.
     */

public class FixedQueue implements ICharQ{

    private char q[];
    private int putloc, getloc;

    // Constrói fila vazia dado seu tamanho
    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    // Insere um caracter na fila.
    public void put(char ch)
        throws QueueFullException{

        if(putloc == q.length)
            throw new QueueFullException(q.length);

        q[putloc++] = ch;
    }

    // Remove um caracter da fila
    public char get()
        throws QueueEmptyException{

        if(getloc == putloc)
            throw new QueueEmptyException();

        return q[getloc++];
    }
}
