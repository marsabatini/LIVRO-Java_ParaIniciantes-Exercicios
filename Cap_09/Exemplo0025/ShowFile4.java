package Cap_09.Exemplo0025;

    /*
        Esta versão do programa ShowFile usa uma instrucão try-with-resources
        para fechar automaticamente um arquivo quando ele não é mais necessário.
     */

import java.io.FileInputStream;
import java.io.IOException;

public class ShowFile4 {

    public static void main(String args[]) {

        int i;

        // Primeiro, confirma se um nome de arquivo foi especificado.
        if (args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

    /*
        O código a seguir usa try-with-resources para abrir um arquivo
        e, depois, fechá-lo automaticamente quando o bloco try é deixado.
     */
        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char) i);
            } while (i != -1);
        } catch(IOException exception){
            System.out.println("I/O Error: " + exception);
        }
    }
}
