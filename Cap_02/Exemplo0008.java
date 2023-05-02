package Cap_02;/*

    Tente isso 1 - 2
    ESte programa exive uma tabela de conversões de galões em litros

 */

public class Exemplo0008 {
    public static void main (String args[]){

        double gallons, litters;
        int counter;

        counter = 0; // o contador é configurado inicialmente com valor = 0
        for (gallons = 1; gallons <= 100; gallons++){

            litters = gallons * 3.7854; // converte para litros
            System.out.println(gallons + " gallons is " + litters + " litters.");

            counter++; // incrementa o contador de linhas a cada iteraćão do loop

            // a cada décima linha, exibe uma linha em branco
            if (counter == 10) { //se o valor do contador for 10, exibe uma linha em branco.

                System.out.println();
                counter = 0; // zera o contador de linhas
            }
        }
    }
}
