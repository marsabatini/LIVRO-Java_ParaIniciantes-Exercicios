package Cap_07.Exemplo0001;

    // Uma subclasse de TwoDShape para retângulos
public class Rectangle1 extends TwoDShape1 {

    boolean isSquare(){
        if(width == height)
            return true;
        return false;
    }

    double area(){
        return width * height;
    }

}
