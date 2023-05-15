package Cap_12.Exemplo0004;

    // Usa um curinga

public class NumericFns<T extends Number> {

    T num;

    // Passa para o construtor uma referência a um obj numérico
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

    // Determina se os valores absolutos de dois obj são iguais
    boolean absEqual(NumericFns<?> ob){
        if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
            return true;

        return false;
    }
}
