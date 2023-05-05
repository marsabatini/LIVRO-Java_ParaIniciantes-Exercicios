package Cap_09.Exemplo0012;

    // Esse código usa os métodos de Throwable,
    // demonstrando a versatilidade em se cap-
    // turar e controlar uma excecão

public class ExcTest {

    static void genException(){
        int nums[] = new int[4];

        System.out.println("Befero exception is generated.");

        // gera uma excecão de índice fora do limite
        nums[7] = 10;
        System.out.println("This won't be displayed.");
    }
}
