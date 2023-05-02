package Cap_05;

    // Operador bitwise &
    // Desativa o bit 6 de letras minúsculas na tabela Unicode/ASCII
    // Com isso, transforma letras minúsculas em maiúsculas

public class Exemplo0021 {

    public static void main(String args[]){

        char ch;

        for(int i = 0; i < 10; i++){
            ch = (char) ('a' + i);
            System.out.print(ch);

            // Essa instrução desativa o 6o bit;
            ch = (char) ((int) ch & 65503); // Agora ch é maiúscula

            System.out.print(ch + " ");
        }
    }
}
