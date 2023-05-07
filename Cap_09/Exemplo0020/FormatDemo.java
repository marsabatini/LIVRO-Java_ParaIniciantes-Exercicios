package Cap_09.Exemplo0020;

    // Exemplo do use de format()

import java.util.Scanner;

public class FormatDemo {

    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        String nome = "Marco Sabatini";

        System.out.format("Olá, meu nome é %s e o seu?\n", nome);
        System.out.print("Digite seu nome: ");
        String visitante = entrada.nextLine();
        System.out.format("Prazer em conhecê-lx %s", visitante);

        entrada.close();
    }
}
