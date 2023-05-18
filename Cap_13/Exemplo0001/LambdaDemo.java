package Cap_13.Exemplo0001;

    // Demonstra duas expressões labda simples

public class LambdaDemo {

    public static void main(String args[]){

        MyValue myVal;      // Declara uma referência de interface

        /*
            Aqui, a expressão lambda é simplesmente uma expressão de constante.
            Quando ela é atribuída a myVal, é construída a instância de uma
            classe em que a expressão lambda implementa o método getValue()
            de MyValue.
         */
        myVal = () -> 98.6;         // Expressão lambda simples

        // Chama getValue(), que é fornecido pela expressão lambda
        // atribuída anteriormente.
        System.out.println("A constant value: " + myVal.getValue());

        /*
            Agora, cria uma expressão lambda parametrizada e a atribui
            a uma referência de MyParamValue. Essa expressão lambda
            retorna o recíproco de seu argumento.
         */
        MyParamValue myPval = (n) -> 1.0 / n;       // Expressão lambda com um parâmetro

        // Chama getValue() por intermédio de referência de myPval
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));

        /*
            Uma expressão lambda deve ser compatível com o método definido
            pela interface funcional. Logo, as instrućões abaixo não funci-
            onarão.
         */
        // myPval = () -> "three";          --> String não é compatível
        // myPval = () -> Math.random();    --> Um parâmetro é necessário
    }
}
