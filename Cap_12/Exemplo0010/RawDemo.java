package Cap_12.Exemplo0010;

public class RawDemo {

    public static void main(String[] args) {


        // Cria um objeto Gen para Integers
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Cria um objeto Gen para Strings
        Gen<String> strOb = new Gen<String>("Generics Test");

        // Cria um objeto Gen de tipo bruto e
        // dá, a ele, um valor Double
        @Deprecated
        Gen raw = new Gen(new Double(98.6));

        // Essa coerćão é necessária porque o tipo é desconhecido.
        double d = (Double) raw.getOb();
        System.out.println("value: " + d);

        // O uso de um tipo bruto pode levar a excećões de tempo
        // de execućão. Aqui estão alguns exemplos:

        // A coerćão a seguir causa um erro em tempo de execućão
        // int i = (Integer) raw.getob();

        // Essa atribuićão sobrepõe a seguranća de tipos
        strOb = raw;    // apesar de correto, pode gerar erros

        // String str = strOb.getob();  --> Erro de execućão

        // Essa atribuićão também sobrepõe a seguranća de tipos
        raw = iOb;      // apesar de correto, pode gerar erros

        // d = (Double) raw.getob();  --> Erro de execućão
    }
}
