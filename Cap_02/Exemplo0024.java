package Cap_02;/*

    Demonstra a conversão por coerćão.
    Ou seja, conversão de tipos incompatíveis.

 */


public class Exemplo0024  {
    public static void main (String args[]){

        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        // Aqui, ocorrerá um truncamento.
        i = (int) (x / y); // converte double em int.
            System.out.println("Integer outcome of x / y: " + i);

        // Não haverá perda de informaćões aqui
        i = 100;
        b = (byte) i; // Um byte pode conter o valor 100.
            System.out.println("Value of b: " + b);

        // Desta vez há perda de informaćões
        i = 257;
        b = (byte) i; // um byte NÃO pode conTer O VALOR 257.
            System.out.println("Value of b: " + b);

        // ASCII para X
        b = 88; //
        ch = (char) b; // Coerćão entre tipos incompatíveis.
            System.out.println("ch: " + ch);
    }
}
