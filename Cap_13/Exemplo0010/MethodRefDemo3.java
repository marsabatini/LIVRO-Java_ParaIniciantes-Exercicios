package Cap_13.Exemplo0010;

// Usa uma referência de método de instância
// para referenciar qualquer instância.

public class MethodRefDemo3 {

    public static void main(String[] args) {

        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Esta instrućão faz inp referenciar o método
        // de instância isFactor().
        MyIntNumPredicate inp = MyIntNum::isFactor;

        // A instrućão a seguir chama isFactor() em myNum.
        result = inp.test(myNum, 3);
        if(result)
            System.out.println("3 is a factor of " + myNum.getNum());

        // A próxima instrućãi chama isFacotr() em muNum2.
        result = inp.test(myNum2, 3);
        if(!result)
            System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}
