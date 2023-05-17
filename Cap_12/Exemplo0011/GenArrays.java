package Cap_12.Exemplo0011;

public class GenArrays {

    public static void main(String args[]){

        Integer n[] = { 1, 2, 3, 4, 5 };

        Gen<Integer> iOb = new Gen<Integer>(50, n);

        // Não pode criar um array de referências
        // genéricas específicas de um tipo
        // Gen<Integer> gens[] = new Gen<Integer>[10];      --> ERRADO!

        // Correto
        Gen<?>[] gens = new Gen<?>[10];
        
    }
}
