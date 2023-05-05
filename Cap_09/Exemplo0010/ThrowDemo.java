package Cap_09.Exemplo0010;

    /*
        Nos exemplos anteriores, os códigos capturavam uma excecão.
        Mas é possível lancar manualmente uma excecão.
     */

public class ThrowDemo {

    public static void main(String args[]){
        try{
            System.out.println("Before throw");
            throw new ArithmeticException();            // Aqui, é lancada a excecão
        } catch (ArithmeticException exc){
            // captura a excecão
            System.out.println("Exception caught.");
        }
        System.out.println("After try/catch block.");
    }
}
