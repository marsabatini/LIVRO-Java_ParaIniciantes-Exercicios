package Cap_06.Exemplo0008;

// Usa uma variável estática
public class StaticDemo {

    int x;              // uma variável de instância comum
    static int y;       // uma variável estática

    // Retorna a soma da variável de instância x
    // e a variável estática y.
    int sum(){
        return x + y;
    }
}
