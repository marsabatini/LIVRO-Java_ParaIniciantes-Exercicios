package Cap_09.Exemplo0021;

    /*
        Exibe um arquivo de texto.

        Para usar este programa, especifique
        o nome do arquivo que deseja ver.
        Por exemplo, para ver um arquivo chamado
        TESTE.TXT, use a linha de comando abaixo:
               ---> java ShowFile TESTE.TXT

     */

import java.io.*;

public class ShowFile {

    public static void main(String args[]){

        int i;
        FileInputStream fin;

        // Primeiro, verifica-se se o arquivo foi especificado.
        if(args.length != 1){
            System.out.println("Usage: ShowFile File");
            return;
        }

        try{
            fin = new FileInputStream(args[0]);     // abre o arquivo
        } catch (FileNotFoundException exc){
            System.out.println("File note found.");
            return;
        }

        try{
            // lê os bytes até o EOF ser alcancado
            do{
                i = fin.read();     // lê o arquivo
                if(i != -1)
                    System.out.println((char) i);
            } while(i != -1);           // quando for -1, o fim do arquivo estará alcando
        } catch (IOException exc){
            System.out.println("Error reading file.");
        }

        try{
            fin.close();
        } catch (IOException exc){
            System.out.println("Error closing file.");
        }
    }
}
