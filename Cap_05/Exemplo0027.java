package Cap_05;

    // Uso do Operador Ternário (?)
    // Programa impede a divisão por zero
public class Exemplo0027 {

    public static void main(String args[]){
        int result;

        for(int i = -5; i < 6; i++){
            result = i != 0 ? 100 / i : 0; // essa parte impede a divisão por zero

            if(i != 0)
                System.out.println("100 / " + i + " is " + result);
        }

        // Mesma operação acima de outro modo
        System.out.println("\nFaz a mesma coisa");

        for(int i = -5; i < 6; i++){
            if(i != 0 ? true : false)
                System.out.println("100 / " + i + " is " + 100 / i);
        }
    }
}
