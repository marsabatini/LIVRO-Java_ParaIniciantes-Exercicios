package Cap_02;/*

    Demonstra valores booleanos: True e/ou False

 */

public class Exemplo0012 {
    public static void main (String args[]){

        boolean b;

        b = false;
        System.out.println("b is " + b);

        b = true;
        System.out.println("Now, b is " + b);

        // Um valor booleano pode controlar uma instrućão if
        if(b)
            System.out.println("This is executed.");

        b = false;
        if(b)
            System.out.println("This is not executed.");

        // note que o operador < é um valor booleano
        System.out.println("10 > 9 is " + (10 > 9));

    }
}
