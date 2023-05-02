package Cap_07.Exemplo0001;

public class Shapes1 {

    public static void main(String args[]){

        Triangle1 t1 = new Triangle1();
        Triangle1 t2 = new Triangle1();

        // Todos os membros de Triangle estão disponíveis para objetos Triangle,
        // mesmo herdados de TwoDShape
        t1.width = 4.0;
        t1.height = 4.0;
        t1.style = "filled";

        t2.width = 8.0;
        t2.height = 12.0;
        t2.style = "outlined";

        System.out.println("Info for t1: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area is " + t1.area());

        System.out.println();

        System.out.println("Info for t2: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area is " + t2.area());

    }
}
