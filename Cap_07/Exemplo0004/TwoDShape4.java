package Cap_07.Exemplo0004;

public class TwoDShape4 {

    private double width;

    private double height;

    // Construtor parametrizado
    TwoDShape4(double w, double h){
        width = w;
        height = h;
    }

    // Métodos acessadores para width e heigth.
    double getWidth(){
        return width;
    }

    double getHeight(){
        return height;
    }

    void setWidth(double w){
        width = w;
    }

    void setHeight(double h){
        height = h;
    }

    void showDim(){
        System.out.println("Width and height " + width + " and " + height);
    }
}
