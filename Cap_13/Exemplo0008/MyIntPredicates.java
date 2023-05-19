package Cap_13.Exemplo0008;

    // Esta classe define três métodos estáticos que
    // verificam um inteiro em relaćão a alguma condićão.

public class MyIntPredicates {

    // Um método que retorna true quando um número é primo
    static boolean isPrime(int n){
        if(n < 2)
            return false;

        for(int i = 2; i <= n/i; i++){
            if((n % i) == 0)
                return false;
        }
        return true;
    }

    // Um método estático que retorna true quando um número é par
    static boolean isEven(int n){
        return (n % 2) == 0;
    }

    // Um método estático que retorna true quando um número é positivo.
    static boolean isPositive(int n){
        return n > 0;
    }
}
