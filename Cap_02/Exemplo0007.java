package Cap_02;/*

    Demonstra um bloco de código
    Programa impede a divisão por 0

 */

public class Exemplo0007 {
    public static void main (String args[]){

        double i, x, j, d;

        i = 5;
        j = 10;
        x = 0;

        // o alvo dessa instrućão if é um bloco de código
        if( i != 0){
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }

        // o alvo dessa instrućão if é ignorar seu bloco de código
        System.out.println("\nA próxima instrućão é ignorada");
        if(x != 0){
            d = j / x;
        }
    }
}
