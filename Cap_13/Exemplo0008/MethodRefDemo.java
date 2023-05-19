package Cap_13.Exemplo0008;

    // Demonstra uma referência a um método estático

public class MethodRefDemo {

    /*
        Este método tem uma interface funcional como tipo de seu
        primeiro parâmetro. Logo, pode receber uma referência a
        qualquer instância dessa interface, inclusive uma criada
        por uma referência de método.
     */
    static boolean numTest(IntPredicate p, int v){
        return p.test(v);
    }

    public static void main(String args[]){

        boolean result;

        // Aqui, uma referência ao método isPrime é passada para numTest().
        result = numTest(MyIntPredicates::isPrime, 17);
        if(result)
            System.out.println("17 is prime.");

        // Em seguida, uma referência ao método isEven é usada.
        result = numTest(MyIntPredicates::isEven, 12);
        if(result)
            System.out.println("12 is even.");

        // Agora, uma referência ao método isPositive é passada.
        result = numTest(MyIntPredicates::isPositive, 11);
        if(result)
            System.out.println("11 is positive.");
    }
}
