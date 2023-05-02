package Cap_07.Exemplo0010;

public class Rectangle10 extends TwoDShape10{

    Rectangle10(){
        super();
    }

    Rectangle10(double w, double h){
        super(w, h, "rectangle"); // chama construtor da superclasse
    }

    Rectangle10(double x){
        super(x, "rectangle"); // chama construtor da superclasse
    }

    // Constrói um objeto a partir de outro
    Rectangle10(Rectangle10 ob){
        super(ob); // passa objeto para construtor de TwoDShape10
    }

    boolean isSquare(){
        if(getWidth() == getHeight())
            return true;
        return false;
    }

    // Sobrepões area() para Rectangle10
    double area(){
        return getWidth() * getHeight();
    }
}
