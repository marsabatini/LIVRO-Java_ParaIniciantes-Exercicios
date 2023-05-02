package Cap_07.Exemplo0008;

public class Shapes8 {

    public static void main(String[] args) {

        Triangle8 t1 = new Triangle8("outlined", 8.0, 12.0);
        Triangle8 t2 = new Triangle8(t1);

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
