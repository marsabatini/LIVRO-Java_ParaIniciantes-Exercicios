package Cap_05;

    // Usa o método substring(), que é um método do objeto String
public class Exemplo0018 {

    public static void main(String args[]){

        String orgstr = "Java makes the Web moves.";

        // Constrói um substring
        String construcao = orgstr.substring(5, 18);

        System.out.println("orgstr: " + orgstr);
        System.out.println("construćão: " + construcao);

    }
}
