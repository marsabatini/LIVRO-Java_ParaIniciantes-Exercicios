package Cap_09.Exemplo0003;

    // Deixa a JVM tratar o erro
public class NotHandled {

    public static void main(String args[]){

        int nums[] = new int[4];

        System.out.println("Befero exception is generated.");


        // Gera uma excecão de índice fora do limite
        nums[7] = 10;
    }
}
