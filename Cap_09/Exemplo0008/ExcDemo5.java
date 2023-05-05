package Cap_09.Exemplo0008;

    // Subclasses devem preceder as superclasses em instrućões catch.

public class ExcDemo5 {

    public static void main(String args[]){

        // Aqui, numer é mais longo do que denom
        int numer[] = { 4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = { 2, 0, 4, 4, 0, 8 };

        for(int i = 0; i < numer.length; i++){
            try{
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i]/denom[i]);
            } catch (ArrayIndexOutOfBoundsException exc){
                // captura a excećão
                System.out.println("No matching element found.");
            } catch (Throwable exc){
                System.out.println("Some exception occurred.");
            }
        }
    }
}
