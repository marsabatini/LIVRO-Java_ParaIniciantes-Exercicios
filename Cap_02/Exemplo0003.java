package Cap_02;/*

    Este programa ilustra a diferenća entre int e double

 */

public class Exemplo0003 {

    public static void main (String args[]){

        int var; // essa instrućão declara uma viarável int
        double x; // esta instrućão declara uma variável double

        var = 10; // atribui valor 10 a var

        x = 10.0; // atribui valor 10.0 a x

        System.out.println("Original value of var: " + var);
        System.out.println("Original value of x: " + x);
        System.out.println(); // Exige uma linha em branco

        // agora, o programa divide as duas por 4
        var = var /4;
        x = x / 4;

        System.out.println("var after division: " + var);
        System.out.println("x after division: " + x);

    }
}
