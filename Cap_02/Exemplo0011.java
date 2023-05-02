package Cap_02;/*

    Variáveis de caracteres podem ser tratadas como inteiros

 */

public class Exemplo0011 {
    public static void main (String args[]){

        char ch;

        ch = 'X';

        System.out.println("ch contains " + ch);

        // Note que um char pode ser incrementado
        ch++; // incrementa ch
        System.out.println("ch is now " + ch);

        // Note que char pode receber valor inteiro
        ch = 90; // atribui a ch o valor Z
        System.out.println("ch is now " + ch);
    }
}
