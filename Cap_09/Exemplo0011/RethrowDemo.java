package Cap_09.Exemplo0011;

public class RethrowDemo {

    public static void main(String args[]){
        try{
            Rethrow.genException();
        } catch (ArrayIndexOutOfBoundsException exc){
            // recaptura a excecão
            System.out.println("Fatal error - program terminated.");
        }
    }
}
