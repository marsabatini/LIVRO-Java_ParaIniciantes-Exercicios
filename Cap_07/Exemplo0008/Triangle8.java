package Cap_07.Exemplo0008;

public class Triangle8 extends TwoDShapes8{

    private String style;

    Triangle8(){
        super();
        style = "none";
    }

    Triangle8(String s, double w, double h){
        super(w, h);

        style = s;
    }

    Triangle8(double x){
        super(x);

        style = "filled";
    }

    // Constrói um objeto a partir de outro
    Triangle8(Triangle8 ob){
        super(ob);
        style = ob.style;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
