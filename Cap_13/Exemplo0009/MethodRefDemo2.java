package Cap_13.Exemplo0009;

    // Usa uma referência a um método de instância

public class MethodRefDemo2 {

    public static void main(String args[]){

        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Aqui, uma referência ao método isFactor() é criada em myNum.
        IntPredicate ip = myNum::isFactor;

        // Agora, ela é usada para chamar isFactor() via test().
        result = ip.test(3);
        if(result)
            System.out.println("3 is factor of " + myNum.getNum());

        // Desta vez, uma referência ao método isFactor() é criada em myNum2
        // e usada para chamar isFactor() via test().
        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result)
            System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}
