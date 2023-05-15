package Cap_12.Exemplo0002;

public class SimpGen {
    public static void main(String[] args) {

        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(88, "Generics");

        // Exibe os tipos
        tgObj.showTypes();

        // Obtém e exibe os valores
        int v = tgObj.getOb1();
        System.out.println("value: " + v);

        String str = tgObj.getOb2();
        System.out.println("value: " + str);
    }
}
