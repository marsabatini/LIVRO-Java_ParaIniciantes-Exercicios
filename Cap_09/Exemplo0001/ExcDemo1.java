package Cap_09.Exemplo0001;

    // O programa a seguir gera propositalmente uma excecão em um array.
    // Em seguida, trata essa excecão.

    // Captura a excecão ArrayIndexOutOfBoundsException

public class ExcDemo1 {

    public static void main(String args[]){

        int nums[] = new int[4];

        // Cria um bloco try
        try{
            System.out.println("Before exception is generated.");

            //Gera uma excećão de índice fora dos limites.
            nums[7] = 10;       // Tenta indexar excedento o limite do array nums
            System.out.println("This won't be displayed.");
        }
        // Captura a excecão
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}
