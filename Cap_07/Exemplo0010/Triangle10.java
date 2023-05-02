package Cap_07.Exemplo0010;

public class Triangle10 extends TwoDShape10{

    private String style;

    Triangle10(){
        super();
        style = "none";
    }

    Triangle10(String s, double w, double h){
        super(w, h, "triangle");

        style = s;
    }

    Triangle10(double x){
        super(x, "triangle"); // chama o construtor da superclasse

        style = "filled";
    }

    // constrói um objeto a partir de outro
    Triangle10(Triangle10 ob){
        super(ob); // passa o objeto para o construtor de TwoDShape

        style = ob.style;
    }

    // Sobrepõe area() para Triangle10
    double area(){
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle is " + style);
    }
}
