package Cap_02;/*

    Promoćão de variéveis inesperada

 */


public class Exemplo0026 {
    public static void main (String args[]){

        byte b;
        int i;

        b = 10;

        // Não é necessária a coerćão porque o resultado já é elavado a int.
        i = b * b; // não é necessária uma coerćão

        b = 10;
        // Aqui, é necessára uma coerćão para atribuir um int a um byte!
        b = (byte) (b * b); // coercã́o necessária!

        System.out.println("i and b: " + i + " " + b);
    }
}
