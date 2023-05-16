package Cap_12.Exemplo0008;

    // Exemplo de interface genérica

    /*
        Uma interface genérico que lida com armazenamento.
        Ela requer que a classe usuária tenha um ou mais
        valores.
     */

public interface Containment<T> {

    // O método contains() verifica se um item
    // especificado está contido em um objeto
    // que implementa Containment.
    boolean contains(T o);
}
