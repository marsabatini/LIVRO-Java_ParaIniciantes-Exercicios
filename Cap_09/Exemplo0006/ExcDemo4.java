package Cap_09.Exemplo0006;

    /*
        O autor demonstra a possibilidade de se utilizar
        vários catchs para um único try.
        Porém, eles devem capturar excecões diferentes,
        como demonstra o programa abaixo, capturando o
        excesso no limite do array e a divisão por zero.
     */

public class ExcDemo4 {

    public static void main(String args[]){

        // Aqui, numer é maior do que denom.
        int numer[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for(int i = 0; i < numer.length; i++){
            try{
                System.out.println(numer[i] + " / " +
                        denom[i] + " is " +
                        numer[i] / denom[i]);
            } catch(ArithmeticException exc){
                System.out.println("Can't duvide by zero.");
            } catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("No matching element found.");
            }
        }
    }
}
