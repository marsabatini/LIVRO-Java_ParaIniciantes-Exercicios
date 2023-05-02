package Cap_02;/*

    Demonstra uma conversão automática de long para double

 */

public class Exemplo0023 {
    public static void main (String args[]){

        long L;
        double D;

        L = 100123285L;
        D = L; // Conversão automática de long para double

        System.out.println("L and D:" + L + " " + D);

    }
}
