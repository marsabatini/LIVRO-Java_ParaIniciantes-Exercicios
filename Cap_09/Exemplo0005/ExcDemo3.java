package Cap_09.Exemplo0005;

    // Trata o erro normalmente e continua a execućão

public class ExcDemo3 {

    public static void main(String args[]){

        int numer[] = { 4, 8, 16, 32, 64, 128};
        int denom[] = { 2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numer.length; i++) {
            try {
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i] / denom[i]);
            } catch (ArithmeticException exc) {
                // Captura a excecão
                System.out.println("Can't divide by zero!");
            }
        }
    }
}
