package Cap_07.Exemplo0002;

// Subclasse de TwoDShape para triângulos
public class Triangle2 extends TwoDShape2 {

    String style;

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
