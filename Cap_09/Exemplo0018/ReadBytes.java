package Cap_09.Exemplo0018;

    // Lê um array de bytes a partir do teclado

import java.io.IOException;

public class ReadBytes {

    public static void main(String args[]) throws IOException {

        byte data[] = new byte[10];

        System.out.println("Enter some caracters.");
        System.in.read(data);
        System.out.print("You entered: ");

        for(int i = 0; i < data.length; i++){
            System.out.print((char) data[i]);
        }
    }
}
