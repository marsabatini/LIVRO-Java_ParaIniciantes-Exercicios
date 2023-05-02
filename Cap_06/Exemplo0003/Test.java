package Cap_06.Exemplo0003;

    // Tipos primitivos são passados por valor.
public class Test {

    int c, a;

    /*
        Esse método não causa alteração nos argumentos
        usados na chamada
     */
    void noChange(int i, int j){
        i = i + j;
        j = -j;
    }
}
