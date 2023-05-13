package Cap_11.Exemplo0002;

public class EnumDemo2 {

    public static void main(String[] args) {

        Transport tp;

        System.out.println("Here are all Transport constants.");

        // Usa values()
        Transport allTransports[] = Transport.values();     // obtém um array de constantes Transport
        for(Transport t: allTransports)
            System.out.println(t);

        System.out.println();

        // Usa valuesOf()
        tp = Transport.valueOf("AIRPLANE");
        System.out.println("tp contains " + tp);
    }
}
