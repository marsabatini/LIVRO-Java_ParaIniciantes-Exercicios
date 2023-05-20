package Cap_13.Exemplo0014;

public class FactorialLambdaDemo {

    public static void main(String args[]){

        // Esta lambda de bloco calcula o fatorial de um valor int.
        MyFunc<Integer> factorial = (n) -> {

            int result = 1;

            for(int i = 1; i <= n; i++)
                result = i * result;

            return result;
        };

        System.out.println("The factorial of 3 is " + factorial.func(3));
        System.out.println("The factorial of 5 is " + factorial.func(5));
        System.out.println("The factorial of 9 is " + factorial.func(9));

    }
}
