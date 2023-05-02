package Cap_05;

    // Uma lista de telefône automatizada simples
    // Trabalha com o args[] no corpo de main
public class Exemplo0020 {

    public static void main(String args[]){

        String numbers[][] = {
                { "Tomy", "555-3322" },
                { "Mary", "555-8978" },
                { "Jony", "555-9811" },
                { "Rach", "555-7823" }
        };

        int i;

        if(args.length != 1){
            System.out.println("Usage: java Phone <name>");
        } else {
            for(i = 0; i < numbers.length; i++){
                if(numbers[i][0].equals(args[0])){
                    System.out.println(numbers[i][0] + ": " + numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length){
                System.out.println("Named not found.");
            }
        }

    }
}
