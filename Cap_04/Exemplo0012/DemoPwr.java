package Cap_04.Exemplo0012;

public class DemoPwr {

    public static void main (String[] args){

        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);

        System.out.println(x.b + " raised to the " + x.e + " power is " + x.getPwr());

        System.out.println(y.b + " raised to the " + y.e + " power is " + y.getPwr());

        System.out.println(z.b + " raised to the " + z.e + " power is " + z.getPwr());
    }
}
