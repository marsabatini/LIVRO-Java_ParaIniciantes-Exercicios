package Cap_02;/*

    Neste exercício, o programa exibe uma tabela de conversões em polegadas para metros,
    Com uma linha em branco a cada 12 polegadas

 */

public class Exer_01_12 {
    public static void main (String args[]){

        double inches, meters;
        int counter;

        counter = 0;

        for(inches = 0; inches <= 144; inches++){
            meters = inches / 39.37; // converte para metros
            System.out.println(inches + " inches is " + meters + " meters.");

            counter++;

            // a cada 12 linhas, exibe uma linha em branco
            if(counter == 12){
                System.out.println();

                counter = 0; // zera o contador de linhas
            }
        }
    }
}
