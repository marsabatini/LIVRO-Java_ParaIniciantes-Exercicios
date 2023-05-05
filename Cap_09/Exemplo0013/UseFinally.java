package Cap_09.Exemplo0013;

    // Usa o finally após try/catch

public class UseFinally {

    public static void genException(int what){

        int t;
        int nums[] = new int[2];

        System.out.println("Receiving " + what);
        try{
            switch (what){
                case 0:
                    t = 10 / what;      // gera erro de divisão por zero.
                    break;
                case 1:
                    nums[4] = 4;        // gera erro de índice de array.
                    break;
                case 2:
                    return;             // retorna do bloco try
            }
        } catch (ArithmeticException exception){
            // captura a excecão
            System.out.println("Can't divide by zero!");
            return; // retorna de catch
        } catch (ArrayIndexOutOfBoundsException exception){
            // captura a excecãp
            System.out.println("No matching element found.");
        } finally {     // essa instrucão é executada quando saímos de try/catch
            System.out.println("Leaving try.");
        }
    }
}
