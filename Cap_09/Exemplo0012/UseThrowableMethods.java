package Cap_09.Exemplo0012;

public class UseThrowableMethods {

    public static void main(String args[]){

        try{
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc){
            // captura a excecão
            System.out.println("Standard message is: ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}
