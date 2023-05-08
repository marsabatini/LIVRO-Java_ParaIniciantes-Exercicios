package Cap_09.Exemplo0026;

    /*
        Refatora o CopyFile a fim de usar o try-with-resource.
        Ela demonstra dois recursos (nesse caso, arquivos)
        gerenciados pela mesma instrucão try.
     */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile2 {

    public static void main(String args[]) throws IOException{

        int i;

        // Primeiro, confirma se os dois arquivos foram especificados.
        if(args.length != 2){
            System.out.println("Usage: CopyFile from... to...");
            return;
        }

        // Abre e gerencia dois arquivos com a instrucão tru.
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout =  new FileOutputStream(args[1])){

            do{
                i = fin.read();
                if(i != -1)
                    fout.write(i);
            } while(i != -1);
        } catch(IOException exception){
            System.out.println("I/O Error: " + exception);
        }
    }
}
