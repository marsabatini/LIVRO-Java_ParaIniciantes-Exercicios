package Cap_11.Exemplo0003;

public class EnumDemo3 {

    public static void main(String args[]){

        // Exibe a velocidade de um avião
        System.out.println("Typical speed for an airplane is " +
                Transport.AIRPLANE.getSpeed() +
                " miles per hour.\n");

        // Exobe todos os meios de trans[prte e velocidades.
        System.out.println("All Transport speeds.");
        for(Transport t: Transport.values())
            System.out.println(t + " typical speed is " +
                    t.getSpeed() +
                    " miles per hour.");
    }
}
