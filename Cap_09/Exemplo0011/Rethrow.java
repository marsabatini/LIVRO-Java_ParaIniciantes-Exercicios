package Cap_09.Exemplo0011;

    // Relanca a excecão

public class Rethrow {

    public static void genException(){

        // Aqui, numer é mais longo do que denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i = 0; i < numer.length; i++){
            try{
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i]/denom[i]);
            } catch (ArithmeticException exc){
                // captura a excecão
                System.out.println("Can't divide by zero!");
            } catch (ArrayIndexOutOfBoundsException exc){
                // captura a excecão
                System.out.println("No matching element found.");
                throw exc;     // relanca a excecão
            }
        }
    }
}
