package Cap_07.Exemplo0011;



public class AbsSahpe11 {

    public static void main(String[] args){

        TwoDShape11 shapes[] = new TwoDShape11[4];

        shapes[0] = new Triangle11("outlined", 8.0, 12.0);
        shapes[1] = new Rectangle11(10);
        shapes[2] = new Rectangle11(10, 4);
        shapes[3] = new Triangle11(7.0);

        for(int i = 0; i < shapes.length; i++){
            System.out.println("object is " + shapes[i].getName());
            System.out.println("Area is " + shapes[i].area());
            System.out.println();
        }
    }
}
