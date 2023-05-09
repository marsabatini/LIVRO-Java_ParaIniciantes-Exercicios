package Cap_09.Exemplo0034;

    // Utilitário 'disco para tela' simples que demonstra um FileReader.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DtoS {

    public static void main(String args[]){

        String s;

        // Cria e usa um FileReader encapsulado em BufferedREader.
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){

            while((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch(IOException exception){
            System.out.println("I/O Error: " + exception);
        }
    }
}
