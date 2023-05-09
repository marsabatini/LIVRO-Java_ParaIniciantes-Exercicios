package Cap_09.Exemplo0036;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Help {

    String helpfile;    // nome do arquivo de ajuda.

    Help(String fname){
        helpfile = fname;
    }

    // Exibe a ajuda sobre um tópico
    boolean helpOn(String what){
        int ch;
        String topic, info;

        // abre o arquivo de ajuda.
        try(BufferedReader helpRdr =
                new BufferedReader(new FileReader(helpfile))){
            do{
                // lê caracteres até um # ser encontrado
                ch = helpRdr.read();

                // agora, vê se os tópicos coincidem
                if( ch == '#'){
                    topic = helpRdr.readLine();

                    if(what.compareTo(topic) == 0){
                        do{
                            info = helpRdr.readLine();
                            if(info != null)
                                System.out.println(info);
                        } while((info != null) && (info.compareTo("") != 0));

                        return true;
                    }
                }
            } while( ch != -1);
        } catch(IOException exception){
            System.out.println("Error accessing help file.");
            return false;
        }

        return false; // tópico não encontrado
    }
}
