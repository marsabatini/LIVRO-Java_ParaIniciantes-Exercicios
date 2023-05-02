package Cap_05.Exemplo0011;

/*
    Uma classe de fila para caracter
 */

public class Queue {

    char q[];   // esse array cont�m a fila
    int putloc; // �ndice put
    int getloc; // �ndice get

    Queue(int size){
        q = new char[size]; // esse array contem a fila
        putloc = getloc = 0;
    }

    // M�todo para inserir um caracrter na fila
    void put(char ch){
        if(putloc == q.length){
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // M�todo para obter um caracter na fila
    char get(){
        if(getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
