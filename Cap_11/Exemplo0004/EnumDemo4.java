package Cap_11.Exemplo0004;

public class EnumDemo4 {

    public static void main(String args[]){

        Transport tp, tp2, tp3;

        // Obtém todos os valores ordinais usando odrinal()
        System.out.println("Here are all Transport constants " +
                " and their ordinal values: ");

        for(Transport t: Transport.values())
            System.out.println(t + " " + t.ordinal());

        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        System.out.println();

        // Demonstra compareTo()
        if(tp.compareTo(tp2) < 0)
            System.out.println(tp + " comes befores " + tp2);

        if(tp.compareTo(tp2) > 0)
            System.out.println(tp2 + " comes befores " + tp);

        if(tp.compareTo(tp3) == 0)
            System.out.println(tp + " equals " + tp3);
    }
}
