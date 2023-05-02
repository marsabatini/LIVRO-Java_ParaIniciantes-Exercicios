package Cap_02;

/*

    Demonstra operadores de curto-circuito.

 */

public class Exemplo0021 {
    public static void main (String args[]){

        int n, d, q;

        n = 10;
        d = 2;

        if(d != 0 && (n %d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0;                                                          // configura d igual a 0.

        // Já que d é igual a 0, o segundo operador não é avaliado
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);             // o operador de curto-circuito impede dividir por 0.

        /*

            Tente a mesma coisa sem o operador de curto-circuito.
            Isso causará um erro de divisão por zero

         */
        if(d != 0 & (n % d) == 0)                                       // Agora as duas expressões são avaliadas, permitindo que ocorra a divisão por zero.
            System.out.println(d + " is a factor of " + n);

    }
}
