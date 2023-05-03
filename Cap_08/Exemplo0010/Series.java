package Cap_08.Exemplo0010;

    // Essa é apenas uma versão melhorada de Series dos exemplos anteriores.
    // Ela inclui um método padrão chamado getNextArray()

public interface Series {

    int getNext();          // retorna o próximo número da série

    // Retorna um array que contém os próximos
    // n elementos da série após o elemento atual.

    default int[] getNextArray(int n){
        int[] vals = new int[n];

        for(int i = 0; i <  n; n++)
            vals[i] = getNext();
        return vals;
    }

    void reset();           // reinicia
    void setStart(int x);   // define o valor inicial
}
