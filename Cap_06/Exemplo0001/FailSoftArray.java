package Cap_06.Exemplo0001;

/*
    Esta classe implementa um array "resistente a falhar"
    que impede a ocorrência de erros em tempo de execução
 */

public class FailSoftArray {

    private int a[];    // referência ao array
    private int errval; // valor a ser retornado se o get() falhar
    public int length;  // length é pública

    /*
        Constrói o array dado seu tamanho e valor a ser retornado
        caso get() falhe
     */
    public FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Retorna o valor do índice especificado.
    public int get(int index){
        if(indexOK(index)) {
            return a[index];    // Detecta o índice fora do limite
        }
        return errval;
    }

    // Insere um valor em um índice. Retornar false caso falhe
    public boolean put(int index, int val){
        if(indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    // Retorna true se index estiver dentro dos limites.
    private boolean indexOK(int index){
        if(index >= 0 & index < length){
            return true;
        }
        return false;
    }
}
