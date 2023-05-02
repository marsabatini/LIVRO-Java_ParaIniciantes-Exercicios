package Cap_05;

    // Usa o operador bitwise ^ (XOR)
    // Usa XOR para codificar e decodificar uma mensagem
public class Exemplo0024 {

    public static void main(String args[]){

        String msg = "This is a test.";
        String encMsg = "";
        String decMsg = "";

        int key = 88;

        System.out.print("Original message: ");
        System.out.println(msg);

        // Codifica a mensagem;
        for(int i = 0; i < msg.length(); i++){
            encMsg = encMsg + (char) (msg.charAt(i) ^ key); // Essa parte constrói a string codificada
        }
        System.out.print("Encoded message: ");
        System.out.println(encMsg);

        // Decodifica a mensagem
        for(int i = 0; i < msg.length(); i++){
            decMsg = decMsg + (char) (encMsg.charAt(i) ^ key); // Constrói a string decodificada
        }
        System.out.print("Decoded message: ");
        System.out.println(decMsg);
    }
}
