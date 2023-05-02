package Cap_07.Exemplo0005;

public class Triangle5 extends TwoDShape5{

    private String style;

    // Construtor padrão
    Triangle5(){
        super();
        style = "none";
    }

    // Construtor
    Triangle5(String s, double w, double h){
        super(w, h);    // chama construtor da superclasse

        style = s;
    }

    // Construtor com um argumento
    Triangle5(double x){
        super(x);       // chama construtor da superclasse

        style = "filled";
    }

    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
