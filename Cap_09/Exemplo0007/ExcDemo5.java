package Cap_09.Exemplo0007;

    // As subclasses devem preceber as superclasses em instrucões catch

public class ExcDemo5 {

    public static void main(String args[]){

        // Aqui, numer é mais longo do que demon.
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int demon[] = { 2, 0, 4, 4, 0, 8 };

        for(int i = 0; i < numer.length; i++){
            try{
                System.out.println(numer[i] + " / " + demon[i] + " is " +
                        numer[i]/demon[i]);
            } catch (ArrayIndexOutOfBoundsException exc){
                // Captura a excecão
                System.out.println("No matching element found.");   // Captura a subclasse
            } catch (Throwable exc){
                System.out.println("Some exceptaion occurred.");    // Captura a superclasse
            }
        }
    }
}
