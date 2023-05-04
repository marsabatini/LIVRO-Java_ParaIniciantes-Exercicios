package Cap_09.Exemplo0002;

public class ExcDemo2 {

    public static void main (String args[]) {


        try {
            ExcTest.genException();
        } catch (ArrayIndexOutOfBoundsException exc){
            // captura a excecão
            System.out.println("Index out-of-bound");
        }
        System.out.println("After catch statement.");
    }
}
