package Cap_05;

    // Exibe os bits de um byte usando o operador bitwise | (OR)
public class Exemplo0023 {

    public static void main(String args[]){

        char ch;

        for(int i = 0; i < 10; i++){
            ch = (char) ('A' + i);
            System.out.print(ch);

            // Essa instrução ativa o 6o bit.
            ch = (char) ((int) ch | 32);    // Agora ch é minúscula
            System.out.print(ch + " ");
        }
    }
}
