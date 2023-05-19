package Cap_13.Exemplo0009;

    // Esta classe armazena um valor int e define
    // o método de instância isFactor(), que retor-
    // na true quando seu argumento é fator do va-
    // lor armazenado.

public class MyIntNum {

    private int v;

    MyIntNum(int x){
        v = x;
    }

    int getNum(){
        return v;
    }

    // Retorna true se n for fator de v.
    boolean isFactor(int n){
        return (v % n) == 0;
    }
}
