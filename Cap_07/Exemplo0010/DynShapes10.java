package Cap_07.Exemplo0010;

public class DynShapes10 {

    public static void main(String[] args){

        TwoDShape10 shapes[] = new TwoDShape10[5];

        shapes[0] = new Triangle10("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle10(10);
        shapes[2] = new Rectangle10(10, 4);
        shapes[3] = new Triangle10(7.0);
        shapes[4] = new TwoDShape10(10, 20, "generic");

        for(int i = 0; i < shapes.length; i++){
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
