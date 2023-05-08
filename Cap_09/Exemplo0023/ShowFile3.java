package Cap_09.Exemplo0023;

    /*
        Esta variacão encapsula o código que abre
        e acessa o arquivo dentro do mesmo bloco try.
        O arquivo é fechado pelo bloco finally.
     */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile3 {

    public static void main(String args[]){

        int i;
        FileInputStream fin = null;         // Aqui, fin é inicializada com null

        // Primeiro, confirma se um nome de arquivo foi especificado.
        if(args.length != 1){
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // A seguir, abre um arquivo, lê caracteres até EOF ser alcancado
        // e, então, fecha o arquivo via bloco finally

        try{
            fin = new FileInputStream(args[0]);     // abre o arquivo

            do{
                i = fin.read();     // lê o arquivo
                if(i != -1)
                    System.out.println((char) i);
            } while(i != -1);           // quando for -1, o fim do arquivo estará alcando

        } catch (FileNotFoundException exc){
            System.out.println("File note found.");
            return;
        } catch (IOException exc){
            System.out.println("Error reading file.");
        } finally {         // Usa uma cláusula finally para fechar o arquivo
            try{
                if(fin != null)
                    fin.close();
            } catch (IOException exc){
                System.out.println("Error closing file.");
            }
        }
    }
}
