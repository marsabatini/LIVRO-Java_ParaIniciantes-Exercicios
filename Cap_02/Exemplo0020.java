package Cap_02;

/*

    Demonstra os operadores relacionais e lógicos.

 */


public class Exemplo0020 {
    public static void main (String args[]){

        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;

        // Uso de operadores relacionais
        if(i < j)
            System.out.println("i < j");

        if(i <= j)
            System.out.println("i <= j");

        if(i != j)
            System.out.println("i != j");

        if(i == j)
            System.out.println("This won't execute");

        if(i >= j)
            System.out.println("This won't execute");

        if(i > j)
            System.out.println("This won't execute");

        b1 = true;
        b2 = false;

        // Uso de operadores lógicos
        if(b1 && b2)
            System.out.println("This won't execute");

        if(!(b1 & b2))
            System.out.println("!(b1 & b2) is true");

        if(b1 | b2)
            System.out.println("b1 | b2 is true");

        if(b1 ^ b2)
            System.out.println("b1 ^ b2 is true");

    }
}
