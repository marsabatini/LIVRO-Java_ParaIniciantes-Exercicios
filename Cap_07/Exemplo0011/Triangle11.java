package Cap_07.Exemplo0011;

import Cap_07.Exemplo0010.Triangle10;

public class Triangle11 extends TwoDShape11{

    private String style;

    Triangle11(){
        super();
        style = "none";
    }

    Triangle11(String s, double w, double h){
        super(w, h, "triangle");

        style = s;
    }

    Triangle11(double x){
        super(x, "triangle"); // chama o construtor da superclasse

        style = "filled";
    }

    // constrói um objeto a partir de outro
    Triangle11(Triangle11 ob){
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
