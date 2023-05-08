package Cap_09.Exemplo0030;

    // Usa um BufferedReader para ler caracters do console

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadChars {

    public static void main(String args[]) throws IOException {


        char c;
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("enter characters, period to quit.");

        // lê caracteres
        do{
            c = (char) br.read();
            System.out.println(c);
        } while(c != '.');
    }
}
