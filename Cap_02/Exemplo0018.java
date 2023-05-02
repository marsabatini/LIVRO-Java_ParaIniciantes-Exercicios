package Cap_02;/*

    Este programa tenta declarar uma variável em um escopo
    interno com o mesmo nome de uma variável definida em um
    escopo externo.

    *** Isso é um erro e esse programa não pode ser compilado

 */

public class Exemplo0018 {
    public static void main (String args[]){

        int count;

        for(count = 0; count < 10; count = count+1){
            System.out.println("This is count: " + count);

            // variável INVÁLIDA
            //int count; // não pode ser declarada uma variável com o mesmo nome
            for(count = 0; count < 2; count++)
                System.out.println("This program is in error!");
        }
    }
}
