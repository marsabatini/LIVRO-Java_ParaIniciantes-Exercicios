package Cap_09.Exemplo0024;
    /*
        Copia um arquivo de texto.
        Para usar esse programa, especifique o nome do
        arquivo de origem e do arquivo de destino.
        Por exemplo, para copiar um arquivo chamado FIRST.TXT
        em um arquivo chamado SECUND.TXT, use a linha de comando a seguir:

        java CopyFile FIRST.TXT SECOND.TXT
     */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

    public static void main(String args[]) throws IOException{

        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Primeiro verifica se os dois arquivos foram especificados.
        if(args.length != 2){
            System.out.println("Usage: CopyFile from... to...");
            return;
        }

        // Copia um arquivo.
        try{
            // Tenta abrir os arquivos.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do{
                i = fin.read();

                // Lê os bytes de um arquivo e grava-os em outro
                if(i != -1)
                    fout.write(i);
            } while (i != -1);
        } catch(IOException exception){
            System.out.println("Error Closing Input File");
        }

        try{
            if(fout != null)
                fout.close();
        } catch (IOException exception){
            System.out.println("Error Closing Output File.");
        }
    }
}
