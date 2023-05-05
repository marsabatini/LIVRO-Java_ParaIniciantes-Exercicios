package Cap_09.Exemplo0009;

    // Usa um bloco try aninhado

public class NestTrys {

    public static void main(String args[]){

        // numer é mais longo do que denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        // try externo
        try{
            for(int i = 0; i < numer.length; i++){

                // try aninhado
                try{
                    System.out.println(numer[i] + " / " +
                            denom[i] + " is " +
                            numer[i]/denom[i]);
                } catch (ArithmeticException exc){
                    // captura a excećão
                    System.out.println("Cant't divide by zero!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc){
            // captura a excećão
            System.out.println("No matching element found.");
            System.out.println("Fatal error - program terminated.");
        }
    }
}
