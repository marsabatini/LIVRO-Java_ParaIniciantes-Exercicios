package Cap_09.Exemplo0017;

    // Interface de fila de caracteres que lanca excecões

public interface ICharQ {

    // Insere um caractere na fila.
    void put(char ch) throws QueueFullException;

    // Retira um caracter da fila
    char get() throws QueueEmptyException;
}
