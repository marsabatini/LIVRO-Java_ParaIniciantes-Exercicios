package Cap_07.Exemplo0004;

public class Triangle4 extends TwoDShape4{

    private String style;

    Triangle4(String s, double w, double h){
        super(w, h);    // Chama o construtor da superclasse

        style = s;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
