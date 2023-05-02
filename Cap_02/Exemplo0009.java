package Cap_02;/*

    Calcula quantas polegas cúbicas há em uma milha cúbica

 */

public class Exemplo0009 {
    public static void main (String args[]){

        long ci; // usa long, pois int não abarcaria o resultado
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci + " cubic inches in cubic mile.");

    }
}
