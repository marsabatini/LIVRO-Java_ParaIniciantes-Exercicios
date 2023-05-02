package Cap_07.Exemplo0011;

import Cap_07.Exemplo0010.Rectangle10;

public class Rectangle11 extends TwoDShape11{

    Rectangle11(){
        super();
    }

    Rectangle11(double w, double h){
        super(w, h, "rectangle"); // chama construtor da superclasse
    }

    Rectangle11(double x){
        super(x, "rectangle"); // chama construtor da superclasse
    }


    // Constrói um objeto a partir de outro
    Rectangle11(Rectangle11 ob){
        super(ob); // passa objeto para construtor de TwoDShape10
    }

    boolean isSquare(){
        if(getWidth() == getHeight())
            return true;
        return false;
    }

    // Sobrepõe area() para Rectangle10
    double area(){
        return getWidth() * getHeight();
    }

}
