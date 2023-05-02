/*

    Usando coerćão

 */


package Cap_02;

public class Exemplo0027 {
    public static void main (String args[]){

        int i;

        for(i = 0; i < 5; i++){
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 with fractions " + (double) i / 3);
            System.out.println();
        }
    }
}
