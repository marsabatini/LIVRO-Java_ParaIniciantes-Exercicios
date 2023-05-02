package Cap_07.Exemplo0003;

// Uma subclasse de TwoDShape para triângulos
public class Triangle3 extends TwoDShape3{

    private String style;

    // Construtor
    Triangle3(String s, double w, double h){
        setWidth(w);
        setHeight(h);

        style = s;
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
