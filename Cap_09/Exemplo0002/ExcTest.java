package Cap_09.Exemplo0002;

    // Uma excecao pode ser gerada por um
    // método e capturada por outro.

public class ExcTest {

    // Gera a excecão
    static void genException(){
        int nums[] = new int[4];

        System.out.println("Befero exception is generated.");

        // Gera uma excecão de índice fora do limite
        nums[7] = 10;       // A excecão é gerada aqui!

        System.out.println("This won't be displayed.");
    }
}
