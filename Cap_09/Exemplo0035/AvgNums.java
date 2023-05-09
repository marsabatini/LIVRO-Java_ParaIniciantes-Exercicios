package Cap_09.Exemplo0035;

    /*
        Este programa calcula a média de uma lista de números
        inseridos pelo usuário.
    */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvgNums {

    public static void main(String args[]) throws IOException{

        // Cria um BufferedReader usando System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.print("How many numbers will you enter: ");
        str = br.readLine();
        try{
            n = Integer.parseInt(str);          // converte a string em int
        } catch(NumberFormatException exc){
            System.out.println("Invalid format.");
            n = 0;
        }

        System.out.println("Enter " + n + " values.");

        for(int i = 0; i < n; i++){
            System.out.print(": ");
            str = br.readLine();

            try{
                t = Double.parseDouble(str);    // converte a string em double
            } catch(NumberFormatException exception){
                System.out.println("Invalid format.");
                t = 0.0;
            }

            sum += t;
        }
        avg = sum / n;
        System.out.println("Average is " + avg);
    }
}
