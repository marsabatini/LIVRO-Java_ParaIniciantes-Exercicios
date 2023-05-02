package Cap_05;

import java.util.Scanner;

// Exibe os bits de um byte usando o operador bitwise & (AND)
public class Exemplo0022 {

    public static void main(String args[]){

        int t;
        byte val;
        byte digitado;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu bit (até 127): ");
        digitado = entrada.nextByte();

        for(t = 128; t > 0; t = t/2){
            if((digitado & t) != 0){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }

        System.out.println("\n\nSaída fixa para 123!");
        val = 123;

        for(t = 128; t > 0; t = t/2){
            if((val & t) != 0){
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
    }
}
