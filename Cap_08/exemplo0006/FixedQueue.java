package Cap_08.exemplo0006;

    // Classe de fila de tamanho fixo para caracteres.

public class FixedQueue implements ICharQ{

    private char q[];           // esse array contém a fila
    private int putloc, getloc; // índices put e get

    // Constrói uma fila vazia dado seu tamanho
    public FixedQueue(int size){
        q = new char[size];     // aloca memória para fila
        putloc = getloc = 0;
    }

    // Insere um caracter na fila
    public void put(char ch){
        if(putloc == q.length){
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // Remove um caracter da fila
    public char get(){
        if(getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
