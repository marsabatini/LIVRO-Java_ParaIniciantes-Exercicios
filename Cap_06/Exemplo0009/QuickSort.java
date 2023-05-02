package Cap_06.Exemplo0009;

// Tente isto 6-3: Uma versão simples da classificação rápida

public class QuickSort {

    // Define uma chamada ao método real de classificação rápida
    static void qSort(char itens[]){
        qs(itens, 0, itens.length-1);
    }

    // Uma versão recursiva da classificação rápida para caracteres
    private static void qs(char itens[], int left, int right){
        int i, j;
        char x, y;

        i = left;
        j = right;
        x = itens[(left + right) / 2];

        do{
            while((itens[i] < x) && (i < right)){
                i++;
            }
            while ((x < itens[j]) && (j > left)){
                j--;
            }

            if(i <= j){
                y = itens[i];
                itens[i] = itens[j];
                itens[j] = y;
                i++;
                j--;
            }
        } while (i <= j);

        if(left < j )
            qs(itens, left, j);

        if(i < right)
            qs(itens, i, right);
    }
}
