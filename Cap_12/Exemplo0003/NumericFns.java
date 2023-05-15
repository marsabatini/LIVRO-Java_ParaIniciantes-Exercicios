package Cap_12.Exemplo0003;

    /*
        Nesta versão de NumericFns, o argumento de
        tipo de T deve ser Number ou uma classe
        derivada de Number.
     */

public class NumericFns <T extends Number>{

    T num;

    // Passa para o construtor uma referência
    // a um objeto numérico.
    NumericFns(T n){
        num = n;
    }

    // Retorna o recíproco
    double reciprocal(){
        return 1 / num.doubleValue();
    }

    // Retorna o componente fracionário
    double fraction(){
        return num.doubleValue() - num.intValue();
    }
}
