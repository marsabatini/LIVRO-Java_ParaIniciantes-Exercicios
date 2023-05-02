package Cap_07.Exemplo0007;

public class Triangle7 extends TwoDShape7{

    private String style;

    // Construtor padrão
    Triangle7(){
        super();
        style = "none";
    }

    Triangle7(String s, double w, double h){
        super(w, h);
        style = s;
    }

    Triangle7(double x){
        super(x);

        style = "filled";
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
