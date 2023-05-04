package Cap_09.Exemplo0004;

    // Não funcionará!

public class ExcTypeMismatch {

    public static void main(String args[]){

        int nums[] = new int[4];

        try{
            System.out.println("Before exception is generated.");

            // Gera uma excecão de índice fora do limite
            nums[7] = 10;
            System.out.println("This won't be displayed.");
        }

        /*
            Não pode capturar um erro de limite de array
            com uma ArithmeticException.
         */
        catch (ArithmeticException exc){    // Essa linha tenta capturar erroneamente a excecão
            System.out.println("Index out-of-bound.");
        }
        System.out.println("After catch statement.");
    }
}
