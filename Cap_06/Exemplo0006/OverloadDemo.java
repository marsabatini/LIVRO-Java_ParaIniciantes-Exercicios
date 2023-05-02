package Cap_06.Exemplo0006;

public class OverloadDemo {

    public static void main(String args[]){

        Overload ob = new Overload();
        int resI;
        double resD;

        // Chama toda as versões dos métodos ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.ovlDemo(1.1, 2.32): " + resD);
    }
}
