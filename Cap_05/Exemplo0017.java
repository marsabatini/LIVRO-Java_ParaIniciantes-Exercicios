package Cap_05;

    // Demonstra arrays de Strings.
public class Exemplo0017 {

    public static void main(String args[]){

        String strs[] = { "This", "is", "a", "test." };

        System.out.println("Original arrays: ");

        for(String s: strs){
            System.out.print(s + " ");
        }
        System.out.println("\n");

        // Altera uma string
        strs[1] = "was";
        strs[3] = "test, too!";

        System.out.println("Modified array: ");
        for(String s: strs){
            System.out.print(s + " ");
        }
    }
}
