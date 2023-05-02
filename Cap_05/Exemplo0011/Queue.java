package Cap_05.Exemplo0011;

/*
    Uma classe de fila para caracter
 */

public class Queue {

    char q[];   // esse array contém a fila
    int putloc; // índice put
    int getloc; // índice get

    Queue(int size){
        q = new char[size]; // esse array contem a fila
        putloc = getloc = 0;
    }

    // Método para inserir um caracrter na fila
    void put(char ch){
        if(putloc == q.length){
            System.out.println(" - Queue is full.");
            return;
        }
        q[putloc++] = ch;
    }

    // Método para obter um caracter na fila
    char get(){
        if(getloc == putloc){
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
