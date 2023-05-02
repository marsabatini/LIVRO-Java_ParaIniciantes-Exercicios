package Cap_06;

// Demonstra argumentos em quantidade variável.
public class Exemplo0011 {

    // vaTest
    static void vaTeste(int ... v){
        System.out.println("Numvers of args: " + v.length);
        System.out.println("Contents: ");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }

        System.out.println();
    }

    public static void main(String args[]){

        // Observe como vaTeste() pode ser chamado
        // com um número de argumentos variável.
        vaTeste(10);        // 1 argumento
        vaTeste(1, 2, 3);   // 3 argumentos
        vaTeste();              // nenhum argumento

    }
}
